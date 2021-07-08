package com.example.json_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;



public class ProfileActivity extends AppCompatActivity {
    TextView txtName, txtSpecies,txtGender ;
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




        image = findViewById(R.id.imageHarry);

        txtName = findViewById(R.id.txtName);
        txtName.setText(name);

        txtSpecies = findViewById(R.id.txtSpecies);
        txtSpecies.setText(species);

        txtGender = findViewById(R.id.txtGender);
        txtGender.setText(gender);

        // using Glide
        try {
            Glide.with(this)
                    .load(exampleItem.getImg())
                    .into(image);
        } catch (Exception ignore) {

        }






    }
}