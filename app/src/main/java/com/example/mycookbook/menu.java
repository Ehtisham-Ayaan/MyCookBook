package com.example.mycookbook;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class menu extends AppCompatActivity {
    ListView myList;
    List<Foods> myData = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();

        setContentView(R.layout.menu);
        myList = findViewById(R.id.myList);
//        ImageView btnEdit = findViewById(R.id.edit_query);

        Bundle extras = getIntent().getExtras();
        String msg = extras.getString("key");

        myData = new FoodsDB(this).getAll(msg);

        ListAdapter adp = new ListAdapter(msg, menu.this);
        myList.setAdapter(adp);

        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                FoodsDB db = new FoodsDB(menu.this);
                ArrayList<Foods> data = db.getAll(msg);

                Foods c = data.get(position);

                    String ID = String.valueOf(c.getId());
                    String name = c.getName();
                    byte[] pic = c.getFoodImage();
                    String cat = c.getCategory();
                    String desc = c.getDescription();
                    String in = c.getIngredients();
                    String qn = c.getQuantity();

                    Intent i = new Intent(menu.this, show.class);
                    i.putExtra("key", ID);
                    i.putExtra("name", name);
                    i.putExtra("pic", pic);
                    i.putExtra("cat", cat);
                    i.putExtra("desc", desc);
                    i.putExtra("ingr", in);
                    i.putExtra("quan", qn);
                    startActivity(i);
                }

        });

    }

}

