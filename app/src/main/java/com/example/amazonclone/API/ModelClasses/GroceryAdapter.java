package com.example.amazonclone.API.ModelClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazonclone.PojoClasses.ResponseGrocery;
import com.example.amazonclone.R;

import java.util.List;

public class GroceryAdapter extends RecyclerView.Adapter<GroceryViewHolder> {

    //    private List<ResponseGrocery> responseGroceryList;
    private List<ResponseGrocery> responseGroceryList;

    public GroceryAdapter(List<ResponseGrocery> responseGroceryList) {
        this.responseGroceryList = responseGroceryList;
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grocery_layout, parent, false);
        return new GroceryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        ResponseGrocery responseGrocery = responseGroceryList.get(position);
        holder.setData(responseGrocery);
    }

    @Override
    public int getItemCount() {
        return responseGroceryList.size();
    }
}
