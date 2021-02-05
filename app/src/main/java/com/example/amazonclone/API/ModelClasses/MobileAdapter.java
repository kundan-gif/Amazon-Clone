package com.example.amazonclone.API.ModelClasses;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazonclone.R;

import java.util.List;

public class MobileAdapter extends RecyclerView.Adapter<MobileViewHolder> {

//    private List<>
    @NonNull
    @Override
    public MobileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mobile_layout,parent,false);
        return new MobileViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MobileViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
