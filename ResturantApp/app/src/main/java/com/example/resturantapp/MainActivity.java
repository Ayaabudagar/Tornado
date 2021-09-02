package com.example.resturantapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addDish = (Button) findViewById(R.id.adddish);
        addDish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent addNewdish = new Intent(MainActivity.this, Adddish.class);
                startActivity(addNewdish);
            }
        });

        Button goToMenu = (Button) findViewById(R.id.menu);
        goToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toMenuPage = new Intent(MainActivity.this, Menu.class);
                startActivity(toMenuPage);
            }
        });



    }
}