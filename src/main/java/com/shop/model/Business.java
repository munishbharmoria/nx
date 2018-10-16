package com.shop.model;

public class Business {

	public String name;
	
	public String address;
	
	public String contactNumber;
	
	public String website;
	
	public String openTime;
	
	public String imageUrl;
	
	public String map;
	
	public String specialization;
	

	public Business() {
		super();
	}

	/*public Business(String name, String address, String contactNumber, String website, String openTime, 
			String imageUrl, String map) {
		super();
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.website = website;
		this.openTime = openTime;
		this.imageUrl =  imageUrl;
		this.map = map;
	}*/
	
	public Business(String name, String address, String contactNumber, String website, String openTime, String imageUrl,
			String map, String specialization) {
		super();
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.website = website;
		this.openTime = openTime;
		this.imageUrl = imageUrl;
		this.map = map;
		this.specialization = specialization;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}
	
	
}
