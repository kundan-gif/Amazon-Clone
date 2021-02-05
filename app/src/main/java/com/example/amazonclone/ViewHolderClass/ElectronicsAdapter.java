package com.example.amazonclone.ViewHolderClass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazonclone.ClickListener;
import com.example.amazonclone.PojoClasses.ResponseElectronics;
import com.example.amazonclone.R;

import java.util.List;

public class ElectronicsAdapter extends RecyclerView.Adapter<ElectronicsViewHolder> {
    private List<ResponseElectronics> responseElectronicsList;
    private ClickListener clickListener;

    public ElectronicsAdapter(List<ResponseElectronics> responseElectronicsList, ClickListener clickListener) {
        this.responseElectronicsList = responseElectronicsList;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public ElectronicsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.electronics_layout,parent,false);
        return new ElectronicsViewHolder(view,clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ElectronicsViewHolder holder, int position) {
     ResponseElectronics responseElectronics=responseElectronicsList.get(position);
     holder.setData(responseElectronics);
    }

    @Override
    public int getItemCount() {
        return responseElectronicsList.size();
    }
}
