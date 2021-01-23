package com.example.mycookbook;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.ByteArrayOutputStream;

public class update extends AppCompatActivity {

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
        setContentView(R.layout.update);

        Bundle extras = getIntent().getExtras();

        String nam = extras.getString("name");
        byte[] pic = extras.getByteArray("pic");
//
        String cate = extras.getString("cat");
        String descr = extras.getString("desc");
        String ingr = extras.getString("ingr");
        String quant = extras.getString("quan");

//        imageView = findViewById(R.id.pic);
//        imageView.(pic);

        imageBitmap = BitmapFactory.decodeByteArray(pic, 0, pic.length);
        imageView = findViewById(R.id.pict);
        imageView.setImageBitmap(Bitmap.createScaledBitmap(imageBitmap, 100, 100, false));

        et = findViewById(R.id.na);
        et.setText(nam);
        des = findViewById(R.id.descr);
        des.setText(descr);
        ing = findViewById(R.id.ingr);
        ing.setText(ingr);
        quan = findViewById(R.id.quant);
        quan.setText(quant);
//        img.setArray(pic);
    }

    static final int PICK_IMAGE = 1;

    public void pic(View view) {

//        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        Intent gallery = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(gallery, PICK_IMAGE);

    }

    public void update(View view) {

        Bundle extras = getIntent().getExtras();

        String id = extras.getString("key");

        radioGroup = findViewById(R.id.radio);
        selectedId = radioGroup.getCheckedRadioButtonId();

        // find the radiobutton by returned id
        radioButton = findViewById(selectedId);

        String cat = radioButton.getText().toString();

//
        String in = ing.getText().toString();
//
        String q = quan.getText().toString();

//
        desc = des.getText().toString();

//        et.setText(nam);
        name = et.getText().toString();

//

            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            imageBitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
            img = stream.toByteArray();

            FoodsDB db = new FoodsDB(this);
            Foods f = new Foods(img, name, cat, in, q, desc);
            db.updateData(f, id);

            i = i + 1;

            Intent g = new Intent(update.this, MainActivity.class);
            startActivity(g);
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



