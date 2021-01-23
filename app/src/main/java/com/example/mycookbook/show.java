package com.example.mycookbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class show extends AppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);
        Objects.requireNonNull(getSupportActionBar()).hide();


    }

    public void delete(View view) {
     try {
         Bundle extras = getIntent().getExtras();
         String id = extras.getString("key");

         FoodsDB db = new FoodsDB(this);
         db.deleteData(id);

         Intent intent = new Intent(this, MainActivity.class);
         startActivity(intent);
     }catch (Exception e) {
         Toast.makeText(this, "Some Error Occurred, Try again Later", Toast.LENGTH_SHORT).show();
     }
    }

    public void edit(View view) {

        try{
        Bundle extras = getIntent().getExtras();
        String id = extras.getString("key");
        String name = extras.getString("name");
        byte[] pic = extras.getByteArray("pic");
        String cat = extras.getString("cat");
        String desc = extras.getString("desc");
        String ingr = extras.getString("ingr");
        String quan = extras.getString("quan");

        Intent i = new Intent(show.this, update.class);
        i.putExtra("key", id);
        i.putExtra("name", name);
        i.putExtra("pic", pic);
        i.putExtra("cat", cat);
        i.putExtra("desc", desc);
        i.putExtra("ingr", ingr);
        i.putExtra("quan", quan);

        startActivity(i);

    }catch (Exception e) {Toast.makeText(this, "Some Error Occurred, Try again Later", Toast.LENGTH_SHORT).show();}
    }

    public void view(View view) {

        try {
            Bundle extras = getIntent().getExtras();
            String id = extras.getString("key");
            String name = extras.getString("name");
            byte[] pic = extras.getByteArray("pic");
            String cat = extras.getString("cat");
            String desc = extras.getString("desc");
            String ingr = extras.getString("ingr");
            String quan = extras.getString("quan");

            Intent i = new Intent(show.this, menudetails.class);
            i.putExtra("key", id);
            i.putExtra("name", name);
            i.putExtra("pic", pic);
            i.putExtra("cat", cat);
            i.putExtra("desc", desc);
            i.putExtra("ingr", ingr);
            i.putExtra("quan", quan);

            startActivity(i);
        }catch (Exception e) {Toast.makeText(this, "Some Error Occurred, Try again Later", Toast.LENGTH_SHORT).show();}

    }
}
