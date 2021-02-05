package com.example.amazonclone;

import com.example.amazonclone.PojoClasses.ResponseFashion;

public interface ClickListener {
    void onItemClicked(ResponseFashion model, int position);
}
