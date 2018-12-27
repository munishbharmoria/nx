package com.shop.controller;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.shop.service.impl.RegisterListingServiceImpl;

@RestController
public class RegisterController {
	
	@Autowired
	RegisterListingServiceImpl registerListing;
	
	@RequestMapping(path = "/submitListing/{listingValues}",  method = RequestMethod.POST)
	public void submitListing(@PathVariable("listingValues") String listingValues) throws InvalidFormatException, IOException {
		System.out.println("jsonString = "+listingValues.toString());
		registerListing.uploadListing(listingValues);
	}
	
		/*@RequestMapping(path = "/submitListing",  method = RequestMethod.POST)
		public void submitListing() throws InvalidFormatException, IOException {
			System.out.println("jsonString = ");
			//registerListing.uploadListing();
		}*/
	
	

}
