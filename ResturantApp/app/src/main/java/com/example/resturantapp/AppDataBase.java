package com.example.resturantapp;

import androidx.room.Database;
import androidx.room.RoomDatabase;


    @Database(entities = {Dish.class}, version = 1)
    public abstract class AppDataBase extends RoomDatabase {
        public abstract DishDao dishDao();
    }

