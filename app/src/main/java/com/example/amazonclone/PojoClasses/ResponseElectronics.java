package com.example.amazonclone.PojoClasses;


import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class ResponseElectronics implements Serializable {

	@SerializedName("image")
	private String image;

	@SerializedName("price")
	private String price;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private int id;

	@SerializedName("title")
	private String title;

	public String getImage(){
		return image;
	}

	public String getPrice(){
		return price;
	}

	public String getDescription(){
		return description;
	}

	public int getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}
}