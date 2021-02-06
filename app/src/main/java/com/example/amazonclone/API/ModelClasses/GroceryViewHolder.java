package com.example.amazonclone.API.ModelClasses;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import com.example.amazonclone.PojoClasses.ResponseGrocery;
import com.example.amazonclone.R;

public class GroceryViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvGroceryImage;
    public GroceryViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mIvGroceryImage = itemView.findViewById(R.id.ivGroceryPic);
    }
    public void setData(ResponseGrocery responseGrocery){

        Glide.with(mIvGroceryImage.getContext()).load(responseGrocery.getImage()).into(mIvGroceryImage);
    }
}
