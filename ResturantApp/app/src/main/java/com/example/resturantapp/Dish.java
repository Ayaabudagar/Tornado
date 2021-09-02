package com.example.resturantapp;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Dish {
    @PrimaryKey(autoGenerate = true)
    public int idDish;
    @ColumnInfo(name= "Dish_name")
    public String name;
    @ColumnInfo  (name= "Dish_price")
    public int price ;
    @ColumnInfo  (name= "Dish_ingredients")
    public String ingredients;

    public Dish(String name, int price, String ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

}
