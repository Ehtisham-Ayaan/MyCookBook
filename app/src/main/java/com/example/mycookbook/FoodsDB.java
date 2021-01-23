package com.example.mycookbook;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

import static android.util.Log.println;

public class FoodsDB extends SQLiteOpenHelper {

    public static final String TABLE_NAME = "Foods";
    public static final String COL_ID = "Id";
    public static final String COL_name = "name";
    public static final String COL_quantity = "quantity";
    public static final String COL_Ingredients = "ingredients";
    public static final String COL_Des = "des";
    public static final String COL_Image = "img";
    public static final String COL_category = "cate";
    public static final String DATABASE_NAME = "FeedReader.db";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COL_ID + " INTEGER PRIMARY KEY," +
                    COL_Image + " BLOB," +
                    COL_name + " TEXT UNIQUE ," +
                    COL_quantity +" TEXT, " +
                    COL_Des +" TEXT , " +
                    COL_Ingredients +" TEXT , " +
                    COL_category + " TEXT)";

    Context c;
    public FoodsDB(Context context) {
        super(context ,DATABASE_NAME  , null , 1);
        c = context;
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
//        String query = "Create table foods_detail(Id integer Primary key , name text,category text,quantity varchar, ingredients text, des text);";
//        String q = "Create table Foods(Id integer Primary key, name text, img )";

        db.execSQL(SQL_CREATE_ENTRIES);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    void deleteData(String Id){
        try{
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME , "Id = ?" , new String[]{Id});
        db.close();
        Toast.makeText(c, "Data Successfully deleted", Toast.LENGTH_SHORT).show();
    }
    catch (Exception e){e.printStackTrace();}
    }

    void updateData(Foods f , String Id){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COL_Ingredients , f.getIngredients());
        cv.put(COL_Image,f.getFoodImage());
        cv.put(COL_Des,f.getDescription());
        cv.put(COL_name,f.getName());
        cv.put(COL_category,f.getCategory());
        cv.put(COL_quantity,f.getQuantity());


     long l = db.update(TABLE_NAME , cv , COL_ID+" = ? " , new String[]{Id});

        if (l == -1) {
            Toast.makeText(c, "Data Exists or Error Accured", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText((Context) c, "Data Updated successfully", Toast.LENGTH_SHORT).show();
        }
      db.close();

    }

    void insert(Foods f) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(COL_Ingredients, f.getIngredients());
        cv.put(COL_Image, f.getFoodImage());
        cv.put(COL_Des, f.getDescription());
        cv.put(COL_name, f.getName());
        cv.put(COL_category, f.getCategory());
        cv.put(COL_quantity, f.getQuantity());



            long l = db.insert(TABLE_NAME, null, cv);
            if (l == -1) {
//                Toast.makeText(c, "Data Exists or Error Accured", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText((Context) c, "Data saved successfully", Toast.LENGTH_SHORT).show();
            }
            db.close();

    }

    ArrayList<Foods> getAll(String category){
        ArrayList<Foods> recepieData = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        //Select * from table
        Cursor cursor = db.query(TABLE_NAME , null , COL_category + "=?", new String[]{category},
                null , null , null);
        cursor.moveToFirst();
        for(int i = 0 ; i < cursor.getCount() ; i++) {
            int id = cursor.getInt(0);
            byte[] pic = cursor.getBlob(1);
            String name = cursor.getString(2);
            String quantity = cursor.getString(3);
            String desc = cursor.getString(4);
            String ingredients = cursor.getString(5);
            String cat = cursor.getString(6);

            Foods p = new Foods(id, pic, name, cat, ingredients, quantity, desc);
            recepieData.add(p);
            cursor.moveToNext();
        }

        return recepieData;
    }
    ArrayList<Foods> getName(){
        ArrayList<Foods> recepieData = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        //Select * from table
        Cursor cursor = db.query(TABLE_NAME , null , null, null,
                null , null , null);
        cursor.moveToFirst();
        for(int i = 0 ; i < cursor.getCount() ; i++) {
            String name = cursor.getString(2);

            Foods p = new Foods(name);
            recepieData.add(p);
            cursor.moveToNext();
        }


        return recepieData;

    }
}
