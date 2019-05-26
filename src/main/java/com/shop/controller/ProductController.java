package com.shop.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.shop.model.Business;
import com.shop.model.Category;
import com.shop.model.CategoryThumbnail;
import com.shop.model.News;
//import com.shop.service.CategoryService;
import com.shop.util.CacheNxData;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ProductController {
	
	@Autowired
    CacheNxData cacheNxData;
	
	private static final Logger LOGGER = LogManager.getLogger(CacheNxData.class);
	
	@RequestMapping(path = "/getNxDirCategories")
	public List<Category> getNxDirCategories() throws InvalidFormatException, IOException {
		List<Category> catListing = cacheNxData.getCategoriesList();
		LOGGER.info("catListing = "+catListing);
		return catListing;
	}
	
	@RequestMapping(path = "/getNxCategoriesThumbnails")
	public List<CategoryThumbnail> getNxCategoriesThumbnails() throws InvalidFormatException, IOException {
		List<CategoryThumbnail> catThumbListing = cacheNxData.getCategoryThumbnailList();
		LOGGER.info("catThumbListing = "+catThumbListing);
		return catThumbListing;
	}
	
	@RequestMapping(path = "/getNxRestaurentList")
	public List<Business> getNxRestaurantsListingList() throws InvalidFormatException, IOException {
		List<Business> restListing = cacheNxData.getRestaurantsListingList();
		LOGGER.info("restListing = "+restListing);
		return restListing;
	}
	
	@RequestMapping(path = "/getNxDoctorList")
	public List<Business> getNxDoctorsListingList() throws InvalidFormatException, IOException {
		List<Business> docListing = cacheNxData.getDoctorsListingList();
		LOGGER.info("docListing = "+docListing);
		return docListing;
	}
	
	@RequestMapping(path = "/getNxHospitalList")
	public List<Business> getNxHospitalsListingList() throws InvalidFormatException, IOException {
		List<Business> hosptListing =  cacheNxData.getHospitalsListingList();
		LOGGER.info("hosptListing = "+hosptListing);
		return hosptListing;
	}
	
	@RequestMapping(path = "/getNxSchoolList")
	public List<Business> getNxSchoolsListingList() throws InvalidFormatException, IOException {
		List<Business> schListing = cacheNxData.getSchoolsListingList();
		LOGGER.info("schListing = "+schListing);
		return schListing;
	}
	
	@RequestMapping(path = "/getNxPlaySchoolList")
	public List<Business> getNxPlaySchoolsListingList() throws InvalidFormatException, IOException {
		List<Business> playSchListing = cacheNxData.getPlaySchoolsListingList();
		LOGGER.info("playSchListing = "+playSchListing);
		return playSchListing;
	}
	
	@RequestMapping(path = "/getNxAutomobileList")
	public List<Business> getNxAutomobilesListingList() throws InvalidFormatException, IOException {
		List<Business> autoMListing = cacheNxData.getAutomobilesListingList();
		LOGGER.info("autoMListing = "+autoMListing);
		return autoMListing;
	}
	
	@RequestMapping(path = "/getNxShoppingList")
	public List<Business> getNxShoppingListingList() throws InvalidFormatException, IOException {
		List<Business> shoppingListing = cacheNxData.getShoppingListingList();
		LOGGER.info("shoppingListing = "+shoppingListing);
		return shoppingListing;
	}
	
	@RequestMapping(path = "/getNxPharmacyList")
	public List<Business> getNxPharmacyListingList() throws InvalidFormatException, IOException {
		List<Business> pharmacyListing = cacheNxData.getPharmacyListingList();
		LOGGER.info("pharmacyListing = "+pharmacyListing);
		return pharmacyListing;
	}
	
	@RequestMapping(path = "/getNxPathLabsList")
	public List<Business> getNxPathLabsListingList() throws InvalidFormatException, IOException {
		List<Business> pathLabsListing = cacheNxData.getPathLabsListingList();
		LOGGER.info("pathLabsListing = "+pathLabsListing);
		return pathLabsListing;
	}
	
	@RequestMapping(path = "/getNxTaxiServiceList")
	public List<Business> getNxTaxiServiceListingList() throws InvalidFormatException, IOException {
		List<Business> taxiServiceListing = cacheNxData.getTaxiServiceListingList();
		LOGGER.info("taxiServiceListing = "+taxiServiceListing);
		return taxiServiceListing;
	}
	
	@RequestMapping(path = "/getNxDailyNeedsList")
	public List<Business> getNxDailyNeedsListingList() throws InvalidFormatException, IOException {
		List<Business> dailyNeedsListing = cacheNxData.getDailyNeedsListingList();
		LOGGER.info("dailyNeedsListing = "+dailyNeedsListing);
		return dailyNeedsListing;
	}
	
	
	@RequestMapping(path = "/getNxPersonalCareList")
	public List<Business> getNxPersonalCareListingList() throws InvalidFormatException, IOException {
		List<Business> personalCareListing = cacheNxData.getPersonalCareListingList();
		LOGGER.info("personalCareListing = "+personalCareListing);
		return personalCareListing;
	}
	
	@RequestMapping(path = "/getNxNews")
	public List<News> getNxNews() throws InvalidFormatException, IOException {
		List<News> newsList = cacheNxData.getNewsList();
		LOGGER.info("newsList = "+newsList);
		return newsList;
	}
	
	@RequestMapping(value = "/admin", method=RequestMethod.GET)
	    public ModelAndView registerBusiness() {
	        ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("key", "register");
			modelAndView.setViewName("home");
			return modelAndView;
	    }
}
