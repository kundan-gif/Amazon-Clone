package com.example.amazonclone.PojoClasses;


import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class ResponseGrocery implements Serializable {

	@SerializedName("image")
	private String image;

	@SerializedName("id")
	private int id;

	public String getImage(){
		return image;
	}

	public int getId(){
		return id;
	}
}