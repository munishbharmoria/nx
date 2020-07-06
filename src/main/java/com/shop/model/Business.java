package com.shop.model;

public class Business {
	
	public String number;
	
	public String active;

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
	
	public String specializationKey;
	
	public String market;
	
	public String marketMain;
	
	public String categoryType;
	
	public String ownerDealer;
	
	public String flatSize;
	
	public String flatDetails;
	
	public String ownerDealerName;
	
	public String cost;
	
	public String locality;
	
	public String fromTo;
	
	public String newsHeadline;
	
	public String newsHeadlineDetails;
	
	public String newsSource;
	
	public String newsSourceLink;
	
	public String newsDate;

	public Business() {
		super();
	}
	
	
	
	
	public Business(String number, String active, String category, String name, String address, String contactNumber, String contactNumberOther,
			String website, String openTime, String imageUrl, String map, String market, String marketMain, String specialization) {
		super();
		this.number = number;
		this.active = active;
		this.category = category;
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.contactNumberOther = contactNumberOther;
		this.website = website;
		this.openTime = openTime;
		this.imageUrl = imageUrl;
		this.map = map;
		this.market = market;
		this.marketMain = marketMain;
		this.specialization = specialization;
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
	
	public Business(String category, String newsHeadline, String newsHeadlineDetails, String newsSource, String newsSourceLink, 
			String imageUrl, String newsDate) {
		this.category = category;
		this.newsHeadline = newsHeadline;
		this.newsHeadlineDetails = newsHeadlineDetails;
		this.newsSource = newsSource;
		this.newsSourceLink = newsSourceLink;
		this.imageUrl = imageUrl;
		this.newsDate = newsDate;
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
	
	public String getSpecializationKey() {
		return specializationKey;
	}

	public void setSpecializationKey(String specializationKey) {
		this.specializationKey = specializationKey;
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

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getOwnerDealer() {
		return ownerDealer;
	}

	public void setOwnerDealer(String ownerDealer) {
		this.ownerDealer = ownerDealer;
	}

	public String getFlatSize() {
		return flatSize;
	}

	public void setFlatSize(String flatSize) {
		this.flatSize = flatSize;
	}

	public String getFlatDetails() {
		return flatDetails;
	}

	public void setFlatDetails(String flatDetails) {
		this.flatDetails = flatDetails;
	}

	public String getOwnerDealerName() {
		return ownerDealerName;
	}

	public void setOwnerDealerName(String ownerDealerName) {
		this.ownerDealerName = ownerDealerName;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getNewsHeadline() {
		return newsHeadline;
	}

	public void setNewsHeadline(String newsHeadline) {
		this.newsHeadline = newsHeadline;
	}

	public String getNewsHeadlineDetails() {
		return newsHeadlineDetails;
	}

	public void setNewsHeadlineDetails(String newsHeadlineDetails) {
		this.newsHeadlineDetails = newsHeadlineDetails;
	}

	public String getNewsSource() {
		return newsSource;
	}

	public void setNewsSource(String newsSource) {
		this.newsSource = newsSource;
	}

	public String getNewsSourceLink() {
		return newsSourceLink;
	}

	public void setNewsSourceLink(String newsSourceLink) {
		this.newsSourceLink = newsSourceLink;
	}

	public String getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(String newsDate) {
		this.newsDate = newsDate;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getMarketMain() {
		return marketMain;
	}

	public void setMarketMain(String marketMain) {
		this.marketMain = marketMain;
	}
	
	
	
}
