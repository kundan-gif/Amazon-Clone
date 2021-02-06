package com.example.amazonclone.ViewHolderClass;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.amazonclone.ClickListener;
import com.example.amazonclone.PojoClasses.ResponseElectronics;
import com.example.amazonclone.R;

public class ElectronicsViewHolder extends RecyclerView.ViewHolder {
    private ImageView mImageElectronics;
    private ClickListener clickListener;
    public ElectronicsViewHolder(@NonNull View itemView,ClickListener clickListener) {
        super(itemView);
        this.clickListener=clickListener;
        initView(itemView);
    }

    private void initView(View itemView) {
        mImageElectronics=itemView.findViewById(R.id.imageElectronics);
    }
    public void setData(ResponseElectronics responseElectronics){
        Glide.with(mImageElectronics.getContext()).load(responseElectronics.getImage()).into(mImageElectronics);
        mImageElectronics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onItemElectronicsClicked(responseElectronics,getAdapterPosition());
            }
        });
    }
}
