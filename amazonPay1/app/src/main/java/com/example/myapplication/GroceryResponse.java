package com.example.myapplication;

import java.io.Serializable;

public class GroceryResponse implements Serializable {
	private String filename;
	private Object price;
	private int width;
	private int rating;
	private String description;
	private String title;
	private String type;
	private int height;

	public void setFilename(String filename)
	{
		this.filename = filename;
	}

	public String getFilename()
	{
		return filename;
	}

	public void setPrice(Object price)
	{
		this.price = price;
	}

	public Object getPrice(){
		return price;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"GroceryResponse{" + 
			"filename = '" + filename + '\'' + 
			",price = '" + price + '\'' + 
			",width = '" + width + '\'' + 
			",rating = '" + rating + '\'' + 
			",description = '" + description + '\'' + 
			",title = '" + title + '\'' + 
			",type = '" + type + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}