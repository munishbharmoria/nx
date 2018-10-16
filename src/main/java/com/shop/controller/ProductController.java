package com.shop.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

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
//import com.shop.service.CategoryService;
import com.shop.util.CacheNxData;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class ProductController {
	/*@Autowired
	private CategoryService categoryService;*/
	
	@Autowired
    CacheNxData cacheNxData;
	
	@RequestMapping(path = "/getNxDirCategories")
	public List<Category> getNxDirCategories() throws InvalidFormatException, IOException {
		HashMap catMap = cacheNxData.loadData();
		List<Category> catListing = (List<Category>) catMap.get("Category");
		return catListing;
		//return categoryService.getNxDirCategories();
	}
	
	
	@RequestMapping(path = "/getNxCategoriesThumbnails")
	public List<CategoryThumbnail> getNxCategoriesThumbnails() throws InvalidFormatException, IOException {
		HashMap catThumbMap = cacheNxData.loadData();
		List<CategoryThumbnail> catThumbListing = (List<CategoryThumbnail>) catThumbMap.get("CategoryThumbnail");
		return catThumbListing;
		//return categoryService.getNxCategoriesThumbnails();
	}
	
	@RequestMapping(path = "/getNxRestaurentList")
	public List<Business> getNxRestaurantsListingList() throws InvalidFormatException, IOException {
		HashMap restMap = cacheNxData.loadData();
		List<Business> restListing = (List<Business>) restMap.get("nxRestList");
		return restListing;
		//return categoryService.getNxRestaurantsListingList();
	}
	
	@RequestMapping(path = "/getNxHospitalList")
	public List<Business> getNxHospitalsListingList() throws InvalidFormatException, IOException {
		HashMap hosptMap = cacheNxData.loadData();
		List<Business> hosptListing = (List<Business>) hosptMap.get("nxHosptList");
		return hosptListing;
	}
	
	@RequestMapping(path = "/getNxSchoolList")
	public List<Business> getNxSchoolsListingList() throws InvalidFormatException, IOException {
		HashMap schMap = cacheNxData.loadData();
		List<Business> schListing = (List<Business>) schMap.get("nxSchList");
		return schListing;
	}
	
	@RequestMapping(path = "/getNxDoctorList")
	public List<Business> getNxDoctorsListingList() throws InvalidFormatException, IOException {
		HashMap docMap = cacheNxData.loadData();
		List<Business> docListing = (List<Business>) docMap.get("nxDocList");
		return docListing;
	}
	
	@RequestMapping(path = "/getNxPlaySchoolList")
	public List<Business> getNxPlaySchoolsListingList() throws InvalidFormatException, IOException {
		HashMap playSchMap = cacheNxData.loadData();
		List<Business> playSchListing = (List<Business>) playSchMap.get("nxPlaySchoolList");
		return playSchListing;
	}
	
	@RequestMapping(value = "/admin", method=RequestMethod.GET)
	    public ModelAndView registerBusiness() {
	        ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("key", "register");
			modelAndView.setViewName("home");
			return modelAndView;
	    }
	
}
