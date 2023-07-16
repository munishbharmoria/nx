package com.shop.controller;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
	
	private static final Logger LOGGER = Logger.getLogger(ProductController.class.getName());
	
	@RequestMapping(path = "/getNxDirCategories")
	public List<Category> getNxDirCategories() throws InvalidFormatException, IOException {
		//clear cache start
		try {
			//ProcessBuilder pb = new ProcessBuilder("/root/nxdial/tools/clearCache.sh");
			//pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//clear cache end
		
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
	
	@RequestMapping(path = "/getNxRentSaleFlatList")
	public List<Business> getNxRentSaleFlatListingList() throws InvalidFormatException, IOException {
		List<Business> rentSaleFlatListing = cacheNxData.getRentSaleFlatListingList();
		LOGGER.info("rentSaleFlatListing = "+rentSaleFlatListing);
		return rentSaleFlatListing;
	}
	
	@RequestMapping(path = "/getNxNewsList")
	public List<Business> getNxNewsListingList() throws InvalidFormatException, IOException {
		List<Business> newsListing = cacheNxData.getNewsListingList();
		LOGGER.info("newsListing = "+newsListing);
		return newsListing;
	}
	
	@RequestMapping(path = "/getNxBusRouteNmrcList")
	public List<Business> getNxBusRouteNmrcListingList() throws InvalidFormatException, IOException {
		List<Business> busRouteNmrcListing = cacheNxData.getBusRouteNmrcListingList();
		LOGGER.info("busRouteNmrcListing = "+busRouteNmrcListing);
		return busRouteNmrcListing;
	}
	
	
	@RequestMapping(path = "/getNxSearchSiteList")
	public List<Business> getNxSearchSiteListingList(@RequestParam String searchSiteString) throws InvalidFormatException, IOException {
		List<Business> searchSiteListing = cacheNxData.getSearchSiteListingList(searchSiteString);
		LOGGER.info("searchSiteListing = "+searchSiteListing);
		return searchSiteListing;
	}
	
	@RequestMapping(path = "/getNxCategoryList")
	public List<Business> getNxCategoryListingList(@RequestParam String selectedCategory) throws InvalidFormatException, IOException {
		List<Business> categoryListing = cacheNxData.getCategoryListingList(selectedCategory);
		//LOGGER.info("categoryListing = "+categoryListing);
		return categoryListing;
	}
	
	
	@RequestMapping(path = "/getUniqueLocationsList")
	public List<Business> getUniqueLocationsList(@RequestParam String selectedCategory) throws InvalidFormatException, IOException {
		List<Business> uniqueLocationsListing = cacheNxData.getUniqueLocationsListingList(selectedCategory);
		//LOGGER.info("uniqueLocationsListing = "+uniqueLocationsListing);
		return uniqueLocationsListing;
	}
	
	@RequestMapping(path = "/getUniqueLocationsOfSearchList")
	public List<Business> getUniqueLocationsOfSearchList(@RequestParam String selectedCategory) throws InvalidFormatException, IOException {
		List<Business> uniqueLocationsOfSearchListing = cacheNxData.getUniqueLocationsOfSearchListingList(selectedCategory);
		//LOGGER.info("uniqueLocationsListing = "+uniqueLocationsListing);
		return uniqueLocationsOfSearchListing;
	}
	
	@RequestMapping(path = "/getNxDoctorsSpecializationKeyList")
	public List<Business> getDoctorsSpecializationKeyList() throws InvalidFormatException, IOException {
		List<Business> doctorsSpecializationKeyListing = cacheNxData.getDoctorsSpecializationKeyListingList();
		//LOGGER.info("doctorsSpecializationKeyListing = "+doctorsSpecializationKeyListing);
		return doctorsSpecializationKeyListing;
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
