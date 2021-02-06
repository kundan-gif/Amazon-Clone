package com.example.amazonclone.ViewHolderClass;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.amazonclone.ClickListener;
import com.example.amazonclone.PojoClasses.ResponseFashion;
import com.example.amazonclone.R;

public class FashionViewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvFashion;
    private TextView mFashionTitle;
    private TextView mTvFashionPrice;
    private TextView mTvFashionDesc;
    private LinearLayout linearLayout;
    private ClickListener clickListener;
    public FashionViewHolder(@NonNull View itemView, ClickListener clickListener) {
        super(itemView);
        this.clickListener=clickListener;
        initView();
    }

    private void initView() {

        mIvFashion=itemView.findViewById(R.id.ivFashion);
        mFashionTitle=itemView.findViewById(R.id.tvFashionTitle);
        mTvFashionPrice=itemView.findViewById(R.id.tvFashionPrice);
        mTvFashionDesc=itemView.findViewById(R.id.tvFashionDesc);
        linearLayout=itemView.findViewById(R.id.linearLayoutFashion);
    }
    public void setData(ResponseFashion responseModel){
        Glide.with(mIvFashion.getContext()).load(responseModel.getImage()).into(mIvFashion);
        mFashionTitle.setText(responseModel.getTitle());
        mTvFashionPrice.setText("₹"+responseModel.getPrice());
        mTvFashionDesc.setText(responseModel.getDescription());
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemClicked(responseModel,getAdapterPosition());
            }
        });

    }
}

