package com.shop.model;

public class CategoryThumbnail {
	
	public String caption;
	
	public String imagePath;
	
	public CategoryThumbnail(String caption, String imagePath) {
		super();
		this.caption = caption;
		this.imagePath = imagePath;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	
	

}
