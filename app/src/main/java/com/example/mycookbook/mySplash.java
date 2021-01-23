package com.example.mycookbook;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class mySplash extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash_view);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Thread t = new Thread(){

            public void run(){
                try {
                    sleep(5000);

                }
                catch (Exception e){

                    e.printStackTrace();

                }
                finally {

                    Intent i = new Intent(mySplash.this, MainActivity.class);
                    startActivity(i);

                }
            }
        };
        t.start();
    }
}
