package com.example.mycookbook;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    ArrayList<Foods> myRecepieData;
    LayoutInflater inflater;

    ListAdapter(String msg, Context c) {

        FoodsDB db = new FoodsDB(c);
        myRecepieData = db.getAll(msg);
        inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return myRecepieData.size();
    }


    @Override
    public View getView(int index, View convertView, ViewGroup parent) {
        View v = inflater.inflate(R.layout.menu_items, null);
        Foods temp = myRecepieData.get(index);

        if (temp == null) {

            TextView n = v.findViewById(R.id.nam);
            n.setText("empty string");


        } else {

            Bitmap bmp = BitmapFactory.decodeByteArray(temp.getFoodImage(), 0, temp.getFoodImage().length);
            ImageView image = v.findViewById(R.id.picu);
            image.setImageBitmap(Bitmap.createScaledBitmap(bmp, 100, 100, false));

            TextView name = v.findViewById(R.id.nam);
            name.setText(temp.getName());


        }


        return v;
    }


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}

