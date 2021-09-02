package com.example.resturantapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Adddish extends AppCompatActivity {
AppDataBase appDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddish);

        final EditText name = findViewById(R.id.enterdishname);
        final EditText price = findViewById(R.id.enterdishprice);
        final EditText ingredients = findViewById(R.id.enteringredientshere);
        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Dish dish = new Dish(name.getText().toString(),Integer.parseInt(price.getText().toString()),ingredients.getText().toString());
                appDataBase = Room.databaseBuilder(getApplicationContext(),AppDataBase.class,"dishes").allowMainThreadQueries().build();

                DishDao dishDao = appDataBase.dishDao();
                appDataBase.dishDao().insertAll(dish);


            }
        });

    }
}