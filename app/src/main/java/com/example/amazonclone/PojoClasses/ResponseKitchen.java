package com.example.amazonclone.PojoClasses;


import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class ResponseKitchen implements Serializable {

	@SerializedName("image")
	private String image;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}
}