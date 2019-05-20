package com.shop.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.shop.model.Business;
import com.shop.model.Category;
import com.shop.model.CategoryThumbnail;
import com.shop.model.News;

@Component
public class CacheNxData {
	
	private static final Logger LOGGER = LogManager.getLogger(CacheNxData.class);

	public List<Category> nxDirCategoryList = new ArrayList<Category>();
	public List<CategoryThumbnail> nxCategoryThumbnailList = new ArrayList<CategoryThumbnail>();
	public List<Business> nxRestaurantsListingList = new ArrayList<Business>();
	public List<Business> nxAutomobilesListingList = new ArrayList<Business>();
	public List<Business> nxHospitalsListingList = new ArrayList<Business>();
	public List<Business> nxSchoolsListingList = new ArrayList<Business>();
	public List<Business> nxDoctorsListingList = new ArrayList<Business>();
	public List<Business> nxPlaySchoolList = new ArrayList<Business>();
	public List<Business> nxShoppingList = new ArrayList<Business>();
	public List<Business> nxPharmacyList = new ArrayList<Business>();
	public List<Business> nxPathLabsList = new ArrayList<Business>();
	public List<Business> nxDailyNeedsList = new ArrayList<Business>();
	
	public List<News> nxNewsList = new ArrayList<News>();
	
	public Workbook getWorkbook() throws InvalidFormatException, IOException {
		Workbook workbook = WorkbookFactory.create(new File(
				"C:\\MunishData\\mp\\project\\workspace\\shop\\shop\\src\\main\\resources\\nxData_local.xlsx"));
				//"/root/nxdial/data/nxData_prod.xlsx"));
		return workbook;
	}
	 
	public List<Category> getCategoriesList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet categorySheet = workbook.getSheet("Category");
		Iterator<Row> cRowIterator = categorySheet.rowIterator();
		nxDirCategoryList.clear();
		while (cRowIterator.hasNext()) {
			Row row = cRowIterator.next();
			if(row.getRowNum() > 0) {
				String name = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String caption = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				nxDirCategoryList.add(new Category(name, caption)); 
			}
		}
		System.out.println("nxDirCategoryList = "+nxDirCategoryList);
		LOGGER.info("nxDirCategoryList = "+nxDirCategoryList);
		
		return nxDirCategoryList;
	}
	
	public List<CategoryThumbnail> getCategoryThumbnailList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		nxCategoryThumbnailList.clear();
		Sheet categoryThumbnailSheet = workbook.getSheet("CategoryThumbnail");
		Iterator<Row> ctRowIterator = categoryThumbnailSheet.rowIterator();
		while (ctRowIterator.hasNext()) {
			Row row = ctRowIterator.next();
			if(row.getRowNum() > 0) {
				String caption = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String imagePath = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				nxCategoryThumbnailList.add(new CategoryThumbnail(caption, imagePath)); 
			}
		}
		System.out.println("nxCategoryThumbnailList = "+nxCategoryThumbnailList);
		LOGGER.info("nxCategoryThumbnailList = "+nxCategoryThumbnailList);
		
		return nxCategoryThumbnailList;
	}
	
	public List<Business> getRestaurantsListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet restaurantsListingSheet = workbook.getSheet("RestaurantsListing");
		Iterator<Row> resRowIterator = restaurantsListingSheet.rowIterator();
		nxRestaurantsListingList.clear();
		while (resRowIterator.hasNext()) {
			Row row = resRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String website = (row.getCell(6) == null) ? "": row.getCell(6).toString();
				String openTime = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String imageUrl = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String map = (row.getCell(9) == null) ? "#": row.getCell(9).toString();
				String market = (row.getCell(10) == null) ? "": row.getCell(10).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxRestaurantsListingList.add(new Business(category, name, address, contactNumber, website, openTime, imageUrl, map, "", market));
				}
			}
			
		}
		System.out.println("nxRestaurantsListingList = "+nxRestaurantsListingList);
		LOGGER.info("nxRestaurantsListingList = "+nxRestaurantsListingList);
		
		return nxRestaurantsListingList;
	}
	
	public List<Business> getHospitalsListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet hospitalsListingSheet = workbook.getSheet("HospitalsListing");
		Iterator<Row> hospRowIterator = hospitalsListingSheet.rowIterator();
		nxHospitalsListingList.clear();
		while (hospRowIterator.hasNext()) {
			Row row = hospRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String website = (row.getCell(6) == null) ? "": row.getCell(6).toString();
				String openTime = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String imageUrl = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String map = (row.getCell(9) == null) ? "#": row.getCell(9).toString();
				String market = (row.getCell(10) == null) ? "": row.getCell(10).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxHospitalsListingList.add(new Business(category, name, address, contactNumber, website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxHospitalsListingList = "+nxHospitalsListingList);
		LOGGER.info("nxRestaurantsListingList = "+nxHospitalsListingList);
		
		return nxHospitalsListingList;
	}
	
	public List<Business> getShoppingListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet shopingListingSheet = workbook.getSheet("ShoppingListing");
		Iterator<Row> shoppingRowIterator = shopingListingSheet.rowIterator();
		nxShoppingList.clear();
		while (shoppingRowIterator.hasNext()) {
			Row row = shoppingRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String website = (row.getCell(6) == null) ? "": row.getCell(6).toString();
				String openTime = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String imageUrl = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String map = (row.getCell(9) == null) ? "#": row.getCell(9).toString();
				String market = (row.getCell(10) == null) ? "": row.getCell(10).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxShoppingList.add(new Business(category, name, address, contactNumber, website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxShoppingList = "+nxShoppingList);
		LOGGER.info("nxShoppingList = "+nxShoppingList);
		
		return nxShoppingList;
	}
	
	
	public List<Business> getSchoolsListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet schoolsListingSheet = workbook.getSheet("SchoolsListing");
		Iterator<Row> schRowIterator = schoolsListingSheet.rowIterator();
		nxSchoolsListingList.clear();
		while (schRowIterator.hasNext()) {
			Row row = schRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String website = (row.getCell(6) == null) ? "": row.getCell(6).toString();
				String openTime = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String imageUrl = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String map = (row.getCell(9) == null) ? "#": row.getCell(9).toString();
				String market = (row.getCell(10) == null) ? "": row.getCell(10).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxSchoolsListingList.add(new Business(category, name, address, contactNumber, website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxSchoolsListingList = "+nxSchoolsListingList);
		LOGGER.info("nxSchoolsListingList = "+nxSchoolsListingList);
		
		return nxSchoolsListingList;
	}
	
	public List<Business> getDoctorsListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet doctorsListingSheet = workbook.getSheet("DoctorsListing");
		Iterator<Row> docRowIterator = doctorsListingSheet.rowIterator();
		nxDoctorsListingList.clear();
		while (docRowIterator.hasNext()) {
			Row row = docRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String website = (row.getCell(6) == null) ? "": row.getCell(6).toString();
				String openTime = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String imageUrl = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String map = (row.getCell(9) == null) ? "#": row.getCell(9).toString();
				String specialization = (row.getCell(10) == null) ? "": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxDoctorsListingList.add(new Business(category, name, address, contactNumber, website, openTime, imageUrl, map, specialization, market));
				}
			}
		}
		System.out.println("nxDoctorsListingList = "+nxDoctorsListingList);
		LOGGER.info("nxDoctorsListingList = "+nxDoctorsListingList);
		
		return nxDoctorsListingList;
	}
	
	public List<Business> getPlaySchoolsListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet playSchoolsListingSheet = workbook.getSheet("PlaySchoolsListing");
		Iterator<Row> playSchRowIterator = playSchoolsListingSheet.rowIterator();
		nxPlaySchoolList.clear();
		while (playSchRowIterator.hasNext()) {
			Row row = playSchRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String website = (row.getCell(6) == null) ? "": row.getCell(6).toString();
				String openTime = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String imageUrl = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String map = (row.getCell(9) == null) ? "#": row.getCell(9).toString();
				String market = (row.getCell(10) == null) ? "": row.getCell(10).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxPlaySchoolList.add(new Business(category, name, address, contactNumber, website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxPlaySchoolList = "+nxPlaySchoolList);
		LOGGER.info("nxPlaySchoolList = "+nxPlaySchoolList);
		
		return nxPlaySchoolList;
	}

	public List<Business> getAutomobilesListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet automobilesListingSheet = workbook.getSheet("AutomobilesListing");
		Iterator<Row> autoMRowIterator = automobilesListingSheet.rowIterator();
		nxAutomobilesListingList.clear();
		while (autoMRowIterator.hasNext()) {
			Row row = autoMRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String website = (row.getCell(6) == null) ? "": row.getCell(6).toString();
				String openTime = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String imageUrl = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String map = (row.getCell(9) == null) ? "#": row.getCell(9).toString();
				String market = (row.getCell(10) == null) ? "": row.getCell(10).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxAutomobilesListingList.add(new Business(category, name, address, contactNumber, website, openTime, imageUrl, map, "", market));
				}
			}
			
		}
		System.out.println("nxAutomobilesListingList = "+nxAutomobilesListingList);
		LOGGER.info("nxAutomobilesListingList = "+nxAutomobilesListingList);
		return nxAutomobilesListingList;
	}
	
	public List<Business> getPharmacyListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet pharmacyListingSheet = workbook.getSheet("PharmacyListing");
		Iterator<Row> pharmacyRowIterator = pharmacyListingSheet.rowIterator();
		nxPharmacyList.clear();
		while (pharmacyRowIterator.hasNext()) {
			Row row = pharmacyRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String website = (row.getCell(6) == null) ? "": row.getCell(6).toString();
				String openTime = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String imageUrl = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String map = (row.getCell(9) == null) ? "#": row.getCell(9).toString();
				String market = (row.getCell(10) == null) ? "": row.getCell(10).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxPharmacyList.add(new Business(category, name, address, contactNumber, website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxPharmacyList = "+nxPharmacyList);
		LOGGER.info("nxPharmacyList = "+nxPharmacyList);
		
		return nxPharmacyList;
	}
	
	public List<Business> getPathLabsListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet pathLabsListingSheet = workbook.getSheet("PathLabsListing");
		Iterator<Row> pathLabsRowIterator = pathLabsListingSheet.rowIterator();
		nxPathLabsList.clear();
		while (pathLabsRowIterator.hasNext()) {
			Row row = pathLabsRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String website = (row.getCell(6) == null) ? "": row.getCell(6).toString();
				String openTime = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String imageUrl = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String map = (row.getCell(9) == null) ? "#": row.getCell(9).toString();
				String market = (row.getCell(10) == null) ? "": row.getCell(10).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxPathLabsList.add(new Business(category, name, address, contactNumber, website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxPathLabsList = "+nxPathLabsList);
		LOGGER.info("nxPathLabsList = "+nxPathLabsList);
		
		return nxPathLabsList;
	}
	
	public List<Business> getDailyNeedsListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet dailyNeedsListingSheet = workbook.getSheet("DailyNeedsListing");
		Iterator<Row> dailyNeedsRowIterator = dailyNeedsListingSheet.rowIterator();
		nxDailyNeedsList.clear();
		while (dailyNeedsRowIterator.hasNext()) {
			Row row = dailyNeedsRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String website = (row.getCell(6) == null) ? "": row.getCell(6).toString();
				String openTime = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String imageUrl = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String map = (row.getCell(9) == null) ? "#": row.getCell(9).toString();
				String market = (row.getCell(10) == null) ? "": row.getCell(10).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxDailyNeedsList.add(new Business(category, name, address, contactNumber, website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxDailyNeedsList = "+nxDailyNeedsList);
		LOGGER.info("nxDailyNeedsList = "+nxDailyNeedsList);
		
		return nxDailyNeedsList;
	}
	
	public List<News> getNewsList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet shopingListingSheet = workbook.getSheet("NewsList");
		Iterator<Row> shoppingRowIterator = shopingListingSheet.rowIterator();
		nxNewsList.clear();
		while (shoppingRowIterator.hasNext()) {
			Row row = shoppingRowIterator.next();
			if(row.getRowNum() > 0) {
				String news = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String newsURL = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				nxNewsList.add(new News(news, newsURL));
			}
		}
		System.out.println("nxNewsList = "+nxNewsList);
		LOGGER.info("nxNewsList = "+nxNewsList);
		
		return nxNewsList;
	}

}
