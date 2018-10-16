package com.shop.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.SystemPropertyUtils;

import com.shop.model.Business;
import com.shop.model.Category;
import com.shop.model.CategoryThumbnail;

@Component
public class CacheNxData {

	public List<Category> nxDirCategoryList = new ArrayList<Category>();
	public List<CategoryThumbnail> nxCategoryThumbnailList = new ArrayList<CategoryThumbnail>();;
	public List<Business> nxRestaurantsListingList = new ArrayList<Business>();
	public List<Business> nxHospitalsListingList = new ArrayList<Business>();
	public List<Business> nxSchoolsListingList = new ArrayList<Business>();
	public List<Business> nxDoctorsListingList = new ArrayList<Business>();
	public List<Business> nxPlaySchoolList = new ArrayList<Business>();

	@Cacheable("nxData")
	public HashMap loadData() throws InvalidFormatException, IOException {
		HashMap cacheMap = new HashMap<>();
		Workbook workbook = WorkbookFactory.create(new File(
				"C:\\MunishData\\mp\\project\\workspace\\shop\\shop\\src\\main\\resources\\nxData.xlsx"));
		Sheet categorySheet = workbook.getSheet("Category");
		Iterator<Row> cRowIterator = categorySheet.rowIterator();
		while (cRowIterator.hasNext()) {
			Row row = cRowIterator.next();
			if(row.getRowNum() > 0) {
				String name = row.getCell(0).toString();
				String caption = row.getCell(1).toString();
				nxDirCategoryList.add(new Category(name, caption)); 
			}
		}
		System.out.println("nxDirCategoryList = "+nxDirCategoryList);
		cacheMap.put("Category", nxDirCategoryList);
		
		Sheet categoryThumbnailSheet = workbook.getSheet("CategoryThumbnail");
		Iterator<Row> ctRowIterator = categoryThumbnailSheet.rowIterator();
		while (ctRowIterator.hasNext()) {
			Row row = ctRowIterator.next();
			if(row.getRowNum() > 0) {
				String caption = row.getCell(0).toString();
				String imagePath = row.getCell(1).toString();
				nxCategoryThumbnailList.add(new CategoryThumbnail(caption, imagePath)); 
			}
		}
		System.out.println("nxCategoryThumbnailList = "+nxCategoryThumbnailList);
		cacheMap.put("CategoryThumbnail", nxCategoryThumbnailList);
		
		
		Sheet restaurantsListingSheet = workbook.getSheet("RestaurantsListing");
		Iterator<Row> resRowIterator = restaurantsListingSheet.rowIterator();
		while (resRowIterator.hasNext()) {
			Row row = resRowIterator.next();
			if(row.getRowNum() > 0) {
				String name = row.getCell(0).toString();
				String address = row.getCell(1).toString();
				String contactNumber = row.getCell(2).toString();
				String website = row.getCell(3).toString();
				String openTime = row.getCell(4).toString();
				String imageUrl = row.getCell(5).toString();
				String map = row.getCell(6).toString();
				nxRestaurantsListingList.add(new Business(name, address, contactNumber, website, openTime, imageUrl, map, ""));
			}
			
		}
		System.out.println("nxRestaurantsListingList = "+nxRestaurantsListingList);
		cacheMap.put("nxRestList", nxRestaurantsListingList);
		
		Sheet hospitalsListingSheet = workbook.getSheet("HospitalsListing");
		Iterator<Row> hospRowIterator = hospitalsListingSheet.rowIterator();
		while (hospRowIterator.hasNext()) {
			Row row = hospRowIterator.next();
			if(row.getRowNum() > 0) {
				String name = row.getCell(0).toString();
				String address = row.getCell(1).toString();
				String contactNumber = row.getCell(2).toString();
				String website = row.getCell(3).toString();
				String openTime = row.getCell(4).toString();
				String imageUrl = row.getCell(5).toString();
				String map = row.getCell(6).toString();
				nxHospitalsListingList.add(new Business(name, address, contactNumber, website, openTime, imageUrl, map, ""));
			}
		}
		System.out.println("nxHospitalsListingList = "+nxHospitalsListingList);
		cacheMap.put("nxHosptList", nxHospitalsListingList);
		
		Sheet schoolsListingSheet = workbook.getSheet("SchoolsListing");
		Iterator<Row> schRowIterator = schoolsListingSheet.rowIterator();
		while (schRowIterator.hasNext()) {
			Row row = schRowIterator.next();
			if(row.getRowNum() > 0) {
				String name = row.getCell(0).toString();
				String address = row.getCell(1).toString();
				String contactNumber = row.getCell(2).toString();
				String website = row.getCell(3).toString();
				String openTime = row.getCell(4).toString();
				String imageUrl = row.getCell(5).toString();
				String map = row.getCell(6).toString();
				nxSchoolsListingList.add(new Business(name, address, contactNumber, website, openTime, imageUrl, map, "")); 
			}
		}
		System.out.println("nxSchoolsListingList = "+nxSchoolsListingList);
		cacheMap.put("nxSchList", nxSchoolsListingList);
		
		Sheet doctorsListingSheet = workbook.getSheet("DoctorsListing");
		Iterator<Row> docRowIterator = doctorsListingSheet.rowIterator();
		while (docRowIterator.hasNext()) {
			Row row = docRowIterator.next();
			if(row.getRowNum() > 0) {
				String name = row.getCell(0).toString();
				String address = row.getCell(1).toString();
				String contactNumber = row.getCell(2).toString();
				String website = row.getCell(3).toString();
				String openTime = row.getCell(4).toString();
				String imageUrl = row.getCell(5).toString();
				String map = row.getCell(6).toString();
				String specialization = row.getCell(7).toString();
				nxDoctorsListingList.add(new Business(name, address, contactNumber, website, openTime, imageUrl, map, specialization)); 
			}
		}
		System.out.println("nxDoctorsListingList = "+nxDoctorsListingList);
		cacheMap.put("nxDocList", nxDoctorsListingList);
		
		
		Sheet playSchoolsListingSheet = workbook.getSheet("PlaySchoolsListing");
		Iterator<Row> playSchRowIterator = playSchoolsListingSheet.rowIterator();
		while (playSchRowIterator.hasNext()) {
			Row row = playSchRowIterator.next();
			if(row.getRowNum() > 0) {
				String name = row.getCell(0).toString();
				String address = row.getCell(1).toString();
				String contactNumber = row.getCell(2).toString();
				String website = row.getCell(3).toString();
				String openTime = row.getCell(4).toString();
				String imageUrl = row.getCell(5).toString();
				String map = row.getCell(6).toString();
				nxPlaySchoolList.add(new Business(name, address, contactNumber, website, openTime, imageUrl, map, "")); 
			}
		}
		System.out.println("nxPlaySchoolList = "+nxPlaySchoolList);
		cacheMap.put("nxPlaySchoolList", nxPlaySchoolList);
		
		
		System.out.println("All cached data====================" + cacheMap);
		return cacheMap;

	}

}
