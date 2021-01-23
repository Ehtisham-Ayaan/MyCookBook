package com.example.mycookbook;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class menudetails extends AppCompatActivity {
    List<Foods> myData = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_details);

        Bundle extras = getIntent().getExtras();
        String id = extras.getString("key");
        String name = extras.getString("name");
        byte[] pic = extras.getByteArray("pic");
        String cat = extras.getString("cat");
        String desc = extras.getString("desc");
        String ingr = extras.getString("ingr");
        String quan = extras.getString("quan");

        FoodsDB db = new FoodsDB(this);

//        myData = db.getAll(id);

        Bitmap bmp = BitmapFactory.decodeByteArray(pic , 0, pic.length);
        ImageView image = findViewById(R.id.img);
        image.setImageBitmap(Bitmap.createScaledBitmap(bmp, 100, 100 , false));

       TextView txt = findViewById(R.id.nme);
        txt.setText(name);
       TextView c = findViewById(R.id.c);
       c.setText(cat);
       TextView des = findViewById(R.id.dsc);
        des.setText(desc);
        TextView ing = findViewById(R.id.ingr);
        ing.setText(ingr);
        TextView q = findViewById(R.id.q);
        q.setText(quan);

    }
}
