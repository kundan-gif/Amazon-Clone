package com.example.amazonclone.API.ModelClasses;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazonclone.PojoClasses.ResponseMobile;
import com.example.amazonclone.R;

public class MobileViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvTitleMobile, mTvPriceMobile, mTvDescription;
    private ImageView mIvImageMobile, mIvRatingImage;


    public MobileViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mTvTitleMobile = itemView.findViewById(R.id.tvTitleMobile);
        mTvPriceMobile = itemView.findViewById(R.id.tvPriceMobile);
        mTvDescription = itemView.findViewById(R.id.tvDescMobile);
        mIvImageMobile = itemView.findViewById(R.id.ivMobilePic);
        mIvRatingImage = itemView.findViewById(R.id.ivRatingMobile);
    }

    public  void setData(ResponseMobile responseDTO){

//        mTvTitleMobile.setText(responseDTO.get);
    }
}
