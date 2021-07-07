package com.example.json_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;


public class ProfileActivity extends AppCompatActivity {
    TextView textView;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Intent intent = getIntent();
        ExampleItem exampleItem = intent.getParcelableExtra("Example Item");

        String name  = exampleItem.getName();
        String species  = exampleItem.getSpecies();
        String gender  = exampleItem.getGender();
//        String img  = exampleItem.getImg();



        image = findViewById(R.id.img);

        textView = findViewById(R.id.textView10);
        textView.setText(name);

        textView = findViewById(R.id.textView11);
        textView.setText(species);

        textView = findViewById(R.id.textView12);
        textView.setText(gender);

        // using Glide
        try {
            Glide.with(this)
                    .load(exampleItem.getImg())
                    .into(image);
        } catch (Exception ignore) {

        }



//
//        String username = "Username not set";
//
//        Bundle extras = getIntent().getExtras();
//        if (extras != null){
//            username = extras.getString("username");
//        }
//
//        textView.setText(username);



    }
}