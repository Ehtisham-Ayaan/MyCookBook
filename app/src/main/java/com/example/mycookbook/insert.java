package com.example.mycookbook;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.ArrayList;

public class insert extends AppCompatActivity {

    ImageView imageView;
    Uri imageUri;
    EditText et;
    EditText des;
    String name;
    byte[] img;
    Bitmap imageBitmap;
    int i;
    RadioGroup radioGroup;
    RadioButton radioButton;
    int selectedId;
    String desc;
    EditText ing;
    EditText quan;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insert);
        imageView = findViewById(R.id.pic);
        et = findViewById(R.id.n);
        des = findViewById(R.id.desc);
        ing = findViewById(R.id.ing);
        quan = findViewById(R.id.quan);
    }

    static final int PICK_IMAGE = 1;

    public void pic(View view) {

//        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        Intent gallery = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(gallery, PICK_IMAGE);

    }

    public void save(View view) {

        radioGroup = findViewById(R.id.radio);
        selectedId = radioGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        radioButton = findViewById(selectedId);

        String cat = radioButton.getText().toString();
        String in = ing.getText().toString();

        String q = quan.getText().toString();
        desc = des.getText().toString();
        name = et.getText().toString();
        if (name.equals("")) {
            Toast.makeText(this, "Name is required", Toast.LENGTH_LONG).show();
        }
        else if(in.equals(""))
        {
            Toast.makeText(this, "Ingredients required", Toast.LENGTH_LONG).show();
        }
        else if(q.equals(""))
        {
            Toast.makeText(this, "Quantity is required", Toast.LENGTH_LONG).show();
        }else if (desc.equals("")) {
            Toast.makeText(this, "Steps are required", Toast.LENGTH_LONG).show();
        }
        else {
//        final ArrayList<Foods> myData = new ArrayList<>();
        try{
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            imageBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
            img = stream.toByteArray();

            FoodsDB db = new FoodsDB(this);
            Foods f = new Foods(img, name, cat, in, q, desc);
            db.insert(f);

        }catch(Exception e){ Toast.makeText(this, "Image not Found", Toast.LENGTH_LONG).show(); }
//            imageBitmap.recycle();

//            FoodsDB db = new FoodsDB(this);
//            Foods f = new Foods(img, name, cat, in, q, desc);
//            db.insert(f);

            i = i + 1;

            Intent g = new Intent(insert.this, MainActivity.class);
            startActivity(g);
        }

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


            if (requestCode == PICK_IMAGE && resultCode == RESULT_OK) {
                Bundle extras = data.getExtras();
                imageBitmap = (Bitmap) extras.get("data");

                imageView.setImageBitmap(imageBitmap);

//

                // CALL THIS METHOD TO GET THE URI FROM THE BITMAP
                imageUri = getImageUri(getApplicationContext(), imageBitmap);


            }
        }

        String title = "Title" + i + i;
        public Uri getImageUri(Context inContext, Bitmap inImage) {
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            inImage.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
            String path = MediaStore.Images.Media.insertImage(inContext.getContentResolver(), inImage, title, null);
            return Uri.parse(path);
        }

        public String getRealPathFromURI(Uri uri) {
            Cursor cursor = getContentResolver().query(uri, null, null, null, null);
            cursor.moveToFirst();
            int idx = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA);
            return cursor.getString(idx);
        }

        }



