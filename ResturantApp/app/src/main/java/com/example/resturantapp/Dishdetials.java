package com.example.resturantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Dishdetials extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishdetials);



        Intent intent1 = getIntent();
        String dish1 = intent1.getExtras().getString("name");
        TextView dishName= findViewById(R.id.name1);
        dishName.setText(dish1);



        Intent intent2 = getIntent();
        String dish2 = intent2.getExtras().getString("price");
        TextView dishPrice = findViewById(R.id.price1);
        dishPrice.setText(dish2);



        Intent intent3 = getIntent();
        String diah3 = intent3.getExtras().getString("ingredients");
        TextView dishIngredients = findViewById(R.id.ingredients1);
        dishIngredients.setText(diah3);

    }
}