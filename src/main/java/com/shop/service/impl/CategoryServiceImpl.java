/*package com.shop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shop.model.Business;
import com.shop.model.Category;
import com.shop.model.CategoryThumbnail;
import com.shop.service.CategoryService;
import com.shop.service.ServiceHelper.CategoryServiceHelper;

@Component
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryServiceHelper categoryServiceHelper;

	@Override
	public List<Category> getNxDirCategories() {
		return categoryServiceHelper.getNxDirCategories();
	}

	@Override
	public List<CategoryThumbnail> getNxCategoriesThumbnails() {

		return categoryServiceHelper.getNxCatThumbList();
	}

	@Override
	public List<Business> getNxRestaurantsListingList() {
		return categoryServiceHelper.getNxRestList();
	}
	
	@Override
	public List<Business> getNxHospitalsListingList() {
		return categoryServiceHelper.getNxHospitalList();
	}

}
*/