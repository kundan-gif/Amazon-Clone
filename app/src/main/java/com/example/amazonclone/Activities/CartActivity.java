package com.example.amazonclone.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.amazonclone.R;

public class CartActivity extends AppCompatActivity {
    private ImageView mImageFromFashion;
    private TextView mTvTitleFromFashion;
    private TextView description;
    private TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        initViews();
        getDataFromFashion();
    }

    private void getDataFromFashion() {
        if(getIntent()!=null && getIntent().getExtras()!=null){
            Glide.with(mImageFromFashion.getContext()).load(getIntent().getStringExtra("imageElec")).placeholder(R.drawable.electronics).into(mImageFromFashion);
            mTvTitleFromFashion.setText(getIntent().getStringExtra("titleElec"));
            description.setText(getIntent().getStringExtra("description"));
            price.setText("₹ "+getIntent().getStringExtra("priceFromIntent"));
        }
    }

    private void initViews() {
        mImageFromFashion=findViewById(R.id.imageFromFashion);
        mTvTitleFromFashion=findViewById(R.id.tvTitleFromFashion);
        description=findViewById(R.id.tvDescription);
        price=findViewById(R.id.tvPrice);
    }
}