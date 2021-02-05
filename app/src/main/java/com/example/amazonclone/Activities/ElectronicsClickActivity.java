package com.example.amazonclone.Activities;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.amazonclone.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ElectronicsClickActivity extends AppCompatActivity {
    private TextView mTvElectronicsTitle;
    private TextView mTvElectronicsPrice;
    private TextView mTvElectronicsDesc;
    private ImageView mIvElectronics;
    private Button mBtnAddToCart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics_click);
        initView();
        updateData();
    }

    private void updateData() {
        if(getIntent()!=null&&getIntent().getExtras()!=null){
            mTvElectronicsTitle.setText(getIntent().getStringExtra("titleElectronics"));
            mTvElectronicsDesc.setText(getIntent().getStringExtra("description"));
            mTvElectronicsPrice.setText("₹ "+getIntent().getStringExtra("priceElectronics"));
            Glide.with(mIvElectronics.getContext()).load(getIntent().getStringExtra("imageElectronics")).into(mIvElectronics);
            mBtnAddToCart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(ElectronicsClickActivity.this,CartActivity.class);
                    intent.putExtra("imageElec",mIvElectronics.getResources().toString());
                    intent.putExtra("titleElec",mTvElectronicsTitle.getText().toString());
                    intent.putExtra("description",mTvElectronicsDesc.getText().toString());
                    intent.putExtra("priceFromIntent",mTvElectronicsPrice.getText().toString());
                    startActivity(intent);
                }
            });

        }
    }

    private void initView() {
        mTvElectronicsTitle=findViewById(R.id.tvElectronicsTitle);
        mTvElectronicsDesc=findViewById(R.id.tvElectronicsDesc);
        mTvElectronicsPrice=findViewById(R.id.tvElectronicsPrice);
        mIvElectronics=findViewById(R.id.imageViewElectronics);
        mBtnAddToCart=findViewById(R.id.btnAddToCartElectronics);
    }
}