package com.example.json_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ProfileActivity extends AppCompatActivity {
    TextView textView10, textView11, textView12;
    String name1, img, name2, name3;
    Intent intent;
    ExampleItem exampleItem;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        intent = getIntent();
        exampleItem = intent.getParcelableExtra("Example Item");

        name1 = exampleItem.getName();
        name2 = exampleItem.getSpecies();
        name3 = exampleItem.getGender();
        img = exampleItem.getImg();

        // using Glide
        Glide.with(this)
                .load(img)
                .into(image);


        textView10 = findViewById(R.id.textView10);
        textView10.setText(name1);

        textView11 = findViewById(R.id.textView11);
        textView11.setText(name2);

        textView12 = findViewById(R.id.textView12);
        textView12.setText(name3);

        image = findViewById(R.id.imageView2);



    }
}