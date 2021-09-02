package com.example.resturantapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

public class Menu extends AppCompatActivity  {
AppDataBase appDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mnue);
        appDataBase =  Room.databaseBuilder(getApplicationContext(), AppDataBase.class, "dishes").allowMainThreadQueries()
                .build();
        List<Dish> dishList = appDataBase.dishDao().getAll();
        // get the recycler view
        RecyclerView alldishesRecuclerView = findViewById(R.id.DishListRecyclerView);
        // set a layout manager for this view
        alldishesRecuclerView.setLayoutManager(new LinearLayoutManager(this));
        // set the adapter for this recyclerView
        alldishesRecuclerView.setAdapter(new DishAdapter(dishList));

        Button home = (Button) findViewById(R.id.homebutton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backToHome = new Intent(Menu.this, MainActivity.class);
                startActivity(backToHome);
            }
        });
    }
}