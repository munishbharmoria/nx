package com.shop.service.impl;

import org.springframework.stereotype.Component;

import com.shop.service.RegisterListingService;
import com.shop.service.ServiceHelper.RegisterListingServiceHelper;


@Component
public class RegisterListingServiceImpl implements RegisterListingService{
	
	public void uploadListing(String listingValues) {
		RegisterListingServiceHelper registerListingServiceHelper = new RegisterListingServiceHelper();
		registerListingServiceHelper.uploadListingForApproval(listingValues);
		
	}

}
