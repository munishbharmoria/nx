package com.shop.model;

public class Business {

	public String category;
	
	public String name;
	
	public String address;
	
	public String contactNumber;
	
	public String contactNumberOther;
	
	public String website;
	
	public String openTime;
	
	public String imageUrl;
	
	public String map;
	
	public String specialization;
	
	public String market;
	
	public String categoryType;
	
	public String ownerDealer;
	
	public String flatSize;
	
	public String flatDetails;
	
	public String ownerDealerName;
	
	public String cost;
	
	public String locality;
	
	public String fromTo;

	public Business() {
		super();
	}

	public Business(String category, String name, String address, String contactNumber, String contactNumberOther, String website, String openTime, String imageUrl,
			String map, String specialization, String market) {
		super();
		this.category = category;
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.contactNumberOther = contactNumberOther;
		this.website = website;
		this.openTime = openTime;
		this.imageUrl = imageUrl;
		this.map = map;
		this.specialization = specialization;
		this.market = market;
	}
	
	public Business(String categoryType, String ownerDealer, String flatSize, String flatDetails, String address, String ownerDealerName, String contactNumber, 
			String cost, String imageUrl, String map, String locality, String temp) {
		this.categoryType = categoryType;
		this.ownerDealer = ownerDealer;
		this.flatSize = flatSize;
		this.flatDetails = flatDetails;
		this.address = address;
		this.ownerDealerName = ownerDealerName;
		this.contactNumber = contactNumber;
		this.cost = cost;
		this.imageUrl = imageUrl;
		this.map = map;
		this.locality = locality;
	}
	
	public Business(String fromTo, String imageUrl) {
		this.fromTo = fromTo;
		this.imageUrl = imageUrl;	
	}
	
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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
	
	public String getContactNumberOther() {
		return contactNumberOther;
	}

	public void setContactNumberOther(String contactNumberOther) {
		this.contactNumberOther = contactNumberOther;
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getFromTo() {
		return fromTo;
	}

	public void setFromTo(String fromTo) {
		this.fromTo = fromTo;
	}
	
	
	
}
