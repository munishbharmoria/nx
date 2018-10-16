package com.shop.service;

import java.util.List;

import com.shop.model.Business;
import com.shop.model.Category;
import com.shop.model.CategoryThumbnail;

public interface CategoryService {
	
	public List<Category> getNxDirCategories();
	
	public List<CategoryThumbnail> getNxCategoriesThumbnails();
	
	public List<Business> getNxRestaurantsListingList();
	
	public List<Business> getNxHospitalsListingList();
}
