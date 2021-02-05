package com.example.amazonclone.ViewHolderClass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazonclone.ClickListener;
import com.example.amazonclone.PojoClasses.ResponseFashion;
import com.example.amazonclone.R;

import java.util.List;

public class FashionAdapter  extends RecyclerView.Adapter<FashionViewHolder> {
    private List<ResponseFashion> responseModelList;
    private ClickListener clickListener;

    public FashionAdapter(List<ResponseFashion> responseModelList, ClickListener clickListener) {
        this.responseModelList = responseModelList;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public FashionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fashion_layout,parent,false);
        return new FashionViewHolder(view,clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull FashionViewHolder holder, int position) {
        ResponseFashion responseModel=responseModelList.get(position);
        holder.setData(responseModel);
    }

    @Override
    public int getItemCount() {
        return responseModelList.size();
    }
}

