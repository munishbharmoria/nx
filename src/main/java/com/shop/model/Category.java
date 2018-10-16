package com.shop.model;


public class Category {
	
	public String name;
	
	public String caption;
	
	public Category(String name, String caption) {
		super();
		this.name = name;
		this.caption = caption;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	
	
	
}
