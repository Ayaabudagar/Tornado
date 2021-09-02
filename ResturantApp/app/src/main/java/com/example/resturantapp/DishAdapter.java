package com.example.resturantapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
// Create the class
//  Extend RecyclerView.Adapter
public class DishAdapter extends RecyclerView.Adapter<DishAdapter.DishViewHolder> {
//    create the list the the adapter will use to bind data
    List<Dish> allDish = new ArrayList<>();

    public DishAdapter(List<Dish> allDish) {
        this.allDish = allDish;
    }

    // create the ViewHolder class (Wraps the data and the view)
    public static class DishViewHolder extends RecyclerView.ViewHolder {
        //  The model object
        public Dish dish;
        //  view object
        View itemView;
        // + setting the itemView value
        public DishViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), Dishdetials.class);
                    intent.putExtra("name",dish.name);
                    intent.putExtra("price",dish.price);
                    intent.putExtra("ingredients",dish.ingredients);

                    v.getContext().startActivity(intent);
                }
            });
        }
    }
    @NonNull
    @Override
    public DishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int intent) {
        // 7- create the view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_dish,parent,false);
        DishViewHolder dishViewHolder = new DishViewHolder(view);
        return dishViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull DishViewHolder holder, int position) {
        holder.dish = allDish.get(position);
        TextView name = holder.itemView.findViewById(R.id.name);
        TextView price = holder.itemView.findViewById(R.id.price);


        name.setText(holder.dish.name);
        price.setText(Integer.toString(holder.dish.price));



    }
    @Override
    public int getItemCount() {
        return allDish.size();
    }
}
