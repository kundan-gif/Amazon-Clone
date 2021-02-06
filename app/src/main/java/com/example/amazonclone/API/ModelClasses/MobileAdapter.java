package com.example.amazonclone.API.ModelClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazonclone.PojoClasses.ResponseMobile;
import com.example.amazonclone.R;

import java.util.List;

public class MobileAdapter extends RecyclerView.Adapter<MobileViewHolder> {

    private List<ResponseMobile> responseMobileList;

    public MobileAdapter(List<ResponseMobile> responseMobileList) {
        this.responseMobileList = responseMobileList;
    }

    @NonNull
    @Override
    public MobileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mobile_layout,parent,false);
        return new MobileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MobileViewHolder holder, int position) {
        ResponseMobile responseMobile = responseMobileList.get(position);
        holder.setData(responseMobile);

    }

    @Override
    public int getItemCount() {
        return responseMobileList.size();
    }
}
