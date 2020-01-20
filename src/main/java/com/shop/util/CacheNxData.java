package com.shop.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
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
	public List<Business> nxTaxiServiceList = new ArrayList<Business>();
	public List<Business> nxPersonalCareList = new ArrayList<Business>();
	public List<Business> nxBoutiqueList = new ArrayList<Business>();
	public List<Business> nxRentSaleFlatList = new ArrayList<Business>();
	public List<Business> nxBusRouteNmrcList = new ArrayList<Business>();
	public List<Business> searchSiteList = new ArrayList<Business>();
	public List<Business> searchSiteListFiltered = new ArrayList<Business>();
	public List<Business> nxOtherCategoryList = new ArrayList<Business>();
	
	
	public List<CategoryThumbnail> nxOtherCategoryThumbnailList = new ArrayList<CategoryThumbnail>();
	
	
	
	
	public List<News> nxNewsList = new ArrayList<News>();
	
	public Workbook getWorkbook() throws InvalidFormatException, IOException {
		Workbook workbook = WorkbookFactory.create(new File(
				//"C:\\MunishData\\mp\\workspace\\nx\\src\\main\\resources\\nxData_local.xlsx"));
				"/root/nxdial/data/nxData_prod.xlsx"));
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
	
	public List<CategoryThumbnail> getOtherCategoryThumbnailList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		nxOtherCategoryThumbnailList.clear();
		Sheet otherCategoryThumbnailSheet = workbook.getSheet("OtherCategoryThumbnail");
		Iterator<Row> ctRowIterator = otherCategoryThumbnailSheet.rowIterator();
		while (ctRowIterator.hasNext()) {
			Row row = ctRowIterator.next();
			if(row.getRowNum() > 0) {
				String caption = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String imagePath = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				nxOtherCategoryThumbnailList.add(new CategoryThumbnail(caption, imagePath)); 
			}
		}
		System.out.println("nxCategoryThumbnailList = "+nxOtherCategoryThumbnailList);
		LOGGER.info("nxCategoryThumbnailList = "+nxOtherCategoryThumbnailList);
		
		return nxOtherCategoryThumbnailList;
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
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxRestaurantsListingList.add(new Business(category, name, address, contactNumber, contactNumberOther, 
							website, openTime, imageUrl, map, "", market));
				}
			}
			
		}
		System.out.println("nxRestaurantsListingList = "+nxRestaurantsListingList);
		LOGGER.info("nxRestaurantsListingList = "+nxRestaurantsListingList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("Restaurants")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxRestaurantsListingList.size()>5) {
			Collections.shuffle(nxRestaurantsListingList.subList(topListNumber, nxRestaurantsListingList.size()));
		}
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
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxHospitalsListingList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxHospitalsListingList = "+nxHospitalsListingList);
		LOGGER.info("nxRestaurantsListingList = "+nxHospitalsListingList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("Hospitals")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxHospitalsListingList.size()>5) {
			Collections.shuffle(nxHospitalsListingList.subList(topListNumber, nxHospitalsListingList.size()));
		}
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
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxShoppingList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxShoppingList = "+nxShoppingList);
		LOGGER.info("nxShoppingList = "+nxShoppingList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("Shopping")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxShoppingList.size()>5) {
			Collections.shuffle(nxShoppingList.subList(topListNumber, nxShoppingList.size()));
		}
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
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxSchoolsListingList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxSchoolsListingList = "+nxSchoolsListingList);
		LOGGER.info("nxSchoolsListingList = "+nxSchoolsListingList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("Schools")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxSchoolsListingList.size()>5) {
			Collections.shuffle(nxSchoolsListingList.subList(topListNumber, nxSchoolsListingList.size()));
		}
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
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String specialization = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				String market = (row.getCell(12) == null) ? "": row.getCell(12).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxDoctorsListingList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, specialization, market));
				}
			}
		}
		System.out.println("nxDoctorsListingList = "+nxDoctorsListingList);
		LOGGER.info("nxDoctorsListingList = "+nxDoctorsListingList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("Doctors")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxDoctorsListingList.size()>5) {
			Collections.shuffle(nxDoctorsListingList.subList(topListNumber, nxDoctorsListingList.size()));
		}
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
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxPlaySchoolList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxPlaySchoolList = "+nxPlaySchoolList);
		LOGGER.info("nxPlaySchoolList = "+nxPlaySchoolList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("PlaySchools")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxPlaySchoolList.size()>5) {
			Collections.shuffle(nxPlaySchoolList.subList(topListNumber, nxPlaySchoolList.size()));
		}
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
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxAutomobilesListingList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, "", market));
				}
			}
			
		}
		System.out.println("nxAutomobilesListingList = "+nxAutomobilesListingList);
		LOGGER.info("nxAutomobilesListingList = "+nxAutomobilesListingList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("Automobiles")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
				
		if(nxAutomobilesListingList.size()>5) {
			Collections.shuffle(nxAutomobilesListingList.subList(topListNumber, nxAutomobilesListingList.size()));
		}
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
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxPharmacyList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxPharmacyList = "+nxPharmacyList);
		LOGGER.info("nxPharmacyList = "+nxPharmacyList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("Pharmacy")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxPharmacyList.size()>5) {
			Collections.shuffle(nxPharmacyList.subList(topListNumber, nxPharmacyList.size()));
		}
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
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxPathLabsList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxPathLabsList = "+nxPathLabsList);
		LOGGER.info("nxPathLabsList = "+nxPathLabsList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("PathLabs")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxPathLabsList.size()>5) {
			Collections.shuffle(nxPathLabsList.subList(topListNumber, nxPathLabsList.size()));
		}
		return nxPathLabsList;
	}
	
	
	public List<Business> getTaxiServiceListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet taxiServiceListingSheet = workbook.getSheet("TaxiServiceListing");
		Iterator<Row> taxiServiceRowIterator = taxiServiceListingSheet.rowIterator();
		nxTaxiServiceList.clear();
		while (taxiServiceRowIterator.hasNext()) {
			Row row = taxiServiceRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxTaxiServiceList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxTaxiServiceList = "+nxTaxiServiceList);
		LOGGER.info("nxTaxiServiceList = "+nxTaxiServiceList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("TaxiServices")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxTaxiServiceList.size()>5) {
			Collections.shuffle(nxTaxiServiceList.subList(topListNumber, nxTaxiServiceList.size()));
		}
		return nxTaxiServiceList;
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
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxDailyNeedsList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxDailyNeedsList = "+nxDailyNeedsList);
		LOGGER.info("nxDailyNeedsList = "+nxDailyNeedsList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("DailyNeeds")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxDailyNeedsList.size()>5) {
			Collections.shuffle(nxDailyNeedsList.subList(topListNumber, nxDailyNeedsList.size()));
		}
		return nxDailyNeedsList;
	}
	
	
	public List<Business> getPersonalCareListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet personalCareListingSheet = workbook.getSheet("PersonalCareListing");
		Iterator<Row> personalCareRowIterator = personalCareListingSheet.rowIterator();
		nxPersonalCareList.clear();
		while (personalCareRowIterator.hasNext()) {
			Row row = personalCareRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxPersonalCareList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxPersonalCareList = "+nxPersonalCareList);
		LOGGER.info("nxPersonalCareList = "+nxPersonalCareList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("PersonalCare")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxPersonalCareList.size()>5) {
			Collections.shuffle(nxPersonalCareList.subList(topListNumber, nxPersonalCareList.size()));
		}
		return nxPersonalCareList;
	}
	
	public List<Business> getBoutiqueListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet boutiqueListingSheet = workbook.getSheet("BoutiqueListing");
		Iterator<Row> boutiqueRowIterator = boutiqueListingSheet.rowIterator();
		nxBoutiqueList.clear();
		while (boutiqueRowIterator.hasNext()) {
			Row row = boutiqueRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxBoutiqueList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxBoutiqueList = "+nxBoutiqueList);
		LOGGER.info("nxBoutiqueList = "+nxBoutiqueList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("Boutique")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxBoutiqueList.size()>5) {
			Collections.shuffle(nxBoutiqueList.subList(topListNumber, nxBoutiqueList.size()));
		}
		return nxBoutiqueList;
	}
	
	
	public List<Business> getRentSaleFlatListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet rentSaleFlatListingSheet = workbook.getSheet("RentSaleFlatListing");
		Iterator<Row> rentSaleFlatRowIterator = rentSaleFlatListingSheet.rowIterator();
		nxRentSaleFlatList.clear();
		while (rentSaleFlatRowIterator.hasNext()) {
			Row row = rentSaleFlatRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String categoryType = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String ownerDealer = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String flatSize = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String flatDetails = (row.getCell(6) == null) ? "": row.getCell(6).toString();
				String address = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String ownerDealerName = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String contactNumber = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String cost = (row.getCell(10) == null) ? "": row.getCell(10).toString();
				String imageUrl = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				String map = (row.getCell(12) == null) ? "": row.getCell(12).toString();
				String locality = (row.getCell(13) == null) ? "": row.getCell(13).toString();
				if("Y".equalsIgnoreCase(active)) {
					nxRentSaleFlatList.add(new Business(categoryType, ownerDealer, flatSize, flatDetails, address, ownerDealerName, contactNumber,
							cost, imageUrl, map, locality, ""));
				}
			}
		}
		System.out.println("nxRentSaleFlatList = "+nxRentSaleFlatList);
		LOGGER.info("nxRentSaleFlatList = "+nxRentSaleFlatList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals(("RentSaleFlat")))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxRentSaleFlatList.size()>5) {
			Collections.shuffle(nxRentSaleFlatList.subList(topListNumber, nxRentSaleFlatList.size()));
		}
		return nxRentSaleFlatList;
	}
	
	
	public List<Business> getBusRouteNmrcListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet busRouteNmrcListingSheet = workbook.getSheet("BusRouteNmrcListing");
		Iterator<Row> busRouteNmrcRowIterator = busRouteNmrcListingSheet.rowIterator();
		nxBusRouteNmrcList.clear();
		while (busRouteNmrcRowIterator.hasNext()) {
			Row row = busRouteNmrcRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String fromTo = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String imageUrl = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				
				if("Y".equalsIgnoreCase(active)) {
					nxBusRouteNmrcList.add(new Business(fromTo, imageUrl));
				}
			}
		}
		System.out.println("nxBusRouteNmrcList = "+nxBusRouteNmrcList);
		LOGGER.info("nxBusRouteNmrcList = "+nxBusRouteNmrcList);
		return nxBusRouteNmrcList;
	}
	
	
	public List<Business> getSearchSiteListingList(String searchSiteString) throws InvalidFormatException, IOException {
		
		searchSiteListFiltered.clear();
		searchSiteList.clear();
		searchSiteList.addAll(getRestaurantsListingList());
		searchSiteList.addAll(getDoctorsListingList());
		searchSiteList.addAll(getHospitalsListingList());
		searchSiteList.addAll(getPharmacyListingList());
		searchSiteList.addAll(getPathLabsListingList());
		//searchSiteList.addAll(getRentSaleFlatListingList());
		searchSiteList.addAll(getDailyNeedsListingList());
		searchSiteList.addAll(getSchoolsListingList());
		searchSiteList.addAll(getPlaySchoolsListingList());
		searchSiteList.addAll(getTaxiServiceListingList());
		searchSiteList.addAll(getPersonalCareListingList());
		searchSiteList.addAll(getAutomobilesListingList());
		searchSiteList.addAll(getShoppingListingList());
		searchSiteList.addAll(getBoutiqueListingList());
		searchSiteList.addAll(getOtherCategoryListingList("All"));
		
		for(Business business : searchSiteList) {
			try {
				if((business.getCategory() != null && business.getCategory().toLowerCase().contains(searchSiteString.toLowerCase())) || 
						(business.getName() != null && business.getName().toLowerCase().contains(searchSiteString.toLowerCase())) ||
						(business.getAddress() != null && business.getAddress().toLowerCase().contains(searchSiteString.toLowerCase())) || 
						(business.getMarket() != null && business.getMarket().toLowerCase().contains(searchSiteString.toLowerCase())) ||
				   (business.getCategory().equals("Doctors") && business.getSpecialization() != null && business.getSpecialization().toLowerCase().contains(searchSiteString.toLowerCase())))
				   {
						searchSiteListFiltered.add(business);
				   }
			} catch (Exception e) {
				System.out.println("Error Found");
				e.printStackTrace();// TODO: handle exception
			}
			
		}
		return searchSiteListFiltered;
	}
	
	public List<Business> getOtherCategoryListingList(String otherSelectedCategory) throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet personalCareListingSheet = workbook.getSheet("OtherCategoryListing");
		Iterator<Row> otherCategoryRowIterator = personalCareListingSheet.rowIterator();
		nxOtherCategoryList.clear();
		while (otherCategoryRowIterator.hasNext()) {
			Row row = otherCategoryRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String name = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String address = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String contactNumber = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String contactNumberOther = "";
				if(row.getCell(6) != null && row.getCell(6).toString().trim().length() > 0) {
					contactNumberOther = ", "+row.getCell(6).toString();
				}
				String website = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String openTime = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				String imageUrl = (row.getCell(9) == null) ? "": row.getCell(9).toString();
				String map = (row.getCell(10) == null) ? "#": row.getCell(10).toString();
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();
				if("Y".equalsIgnoreCase(active) && (category.equals(otherSelectedCategory) || otherSelectedCategory.equals("All"))) {
					nxOtherCategoryList.add(new Business(category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, "", market));
				}
			}
		}
		System.out.println("nxOtherCategoryList = "+nxOtherCategoryList);
		LOGGER.info("nxOtherCategoryList = "+nxOtherCategoryList);
		Collections.shuffle(nxOtherCategoryList);
		return nxOtherCategoryList;
	}
	
	
	public List<News> getNewsList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet shopingListingSheet = workbook.getSheet("NewsList");
		Iterator<Row> shoppingRowIterator = shopingListingSheet.rowIterator();
		nxNewsList.clear();
		StringBuffer newsAll = new StringBuffer();
		while (shoppingRowIterator.hasNext()) {
			Row row = shoppingRowIterator.next();
			if(row.getRowNum() > 0) {
				String news = "   >>> " + ((row.getCell(0) == null) ? "": row.getCell(0).toString());
				newsAll = newsAll.append(news);
			}
		}
		nxNewsList.add(new News(newsAll.toString()));
		System.out.println("nxNewsList = "+nxNewsList);
		LOGGER.info("nxNewsList = "+nxNewsList);
		
		return nxNewsList;
	}

}
