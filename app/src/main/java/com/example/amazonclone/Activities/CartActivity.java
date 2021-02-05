package com.example.amazonclone.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amazonclone.R;

public class CartActivity extends AppCompatActivity {
    private ImageView mImageFromFashion;
    private TextView mTvTitleFromFashion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        initViews();
        getDataFromFashion();
    }

    private void getDataFromFashion() {
        if(getIntent()!=null && getIntent().getExtras()!=null){

            mTvTitleFromFashion.setText(getIntent().getStringExtra("title"));
        }
    }

    private void initViews() {
        mImageFromFashion=findViewById(R.id.imageFromFashion);
        mTvTitleFromFashion=findViewById(R.id.tvTitleFromFashion);
    }
}