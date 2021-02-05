package com.shop.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

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
	
	static Logger LOGGER = Logger.getLogger(CacheNxData.class.getName());

	public List<Category> nxDirCategoryList = new ArrayList<Category>();
	public List<CategoryThumbnail> nxCategoryThumbnailList = new ArrayList<CategoryThumbnail>();
	public List<Business> nxRentSaleFlatList = new ArrayList<Business>();
	public List<Business> nxBusRouteNmrcList = new ArrayList<Business>();
	public List<Business> searchSiteList = new ArrayList<Business>();
	public List<Business> searchSiteListFiltered = new ArrayList<Business>();
	public List<Business> nxOtherCategoryList = new ArrayList<Business>();
	public List<Business> newsList = new ArrayList<Business>();
	
	public List<Business> nxCategoryList = new ArrayList<Business>();
	public Set<String> nxUniqueLocationsSet = new HashSet<String>();
	public Set<String> nxUniqueLocationsOfSearchSet = new HashSet<String>();
	
	public Set<String> nxUniqueDoctorsSpecializationKeySet = new HashSet<String>();
	
	public List<CategoryThumbnail> nxOtherCategoryThumbnailList = new ArrayList<CategoryThumbnail>();
	
	
	
	
	public List<News> nxNewsList = new ArrayList<News>();
	
	public Workbook getWorkbook() throws InvalidFormatException, IOException {
		Workbook workbook = WorkbookFactory.create(new File(
				"C:\\munishdata\\mp\\workspace\\nxdial\\nx\\src\\main\\resources\\nxData_local.xlsx"));
				//"C:\\MunishData\\mp\\workspace\\nx\\src\\main\\resources\\nxData_local_all.xlsx"));
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
	
	
	public List<Business> getNewsListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet newsListingSheet = workbook.getSheet("NewsListing");
		Iterator<Row> newsRowIterator = newsListingSheet.rowIterator();
		newsList.clear();
		while (newsRowIterator.hasNext()) {
			Row row = newsRowIterator.next();
			if(row.getRowNum() > 0) {
				String number = (row.getCell(0) == null) ? "": row.getCell(0).toString();
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				String newsHeadline = (row.getCell(3) == null) ? "": row.getCell(3).toString();
				String newsHeadlineDetails = (row.getCell(4) == null) ? "": row.getCell(4).toString();
				String newsSource = (row.getCell(5) == null) ? "": row.getCell(5).toString();
				String newsSourceLink = (row.getCell(6) == null) ? "": row.getCell(6).toString();
				String imageUrl = (row.getCell(7) == null) ? "": row.getCell(7).toString();
				String newsDate = (row.getCell(8) == null) ? "": row.getCell(8).toString();
				if("Y".equalsIgnoreCase(active)) {
					newsList.add(new Business(category, newsHeadline, newsHeadlineDetails, newsSource, newsSourceLink, imageUrl,	newsDate));
				}
			}
		}
		System.out.println("newsList = "+newsList);
		LOGGER.info("newsList = "+newsList);
		
		return newsList;
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
		searchSiteList.addAll(getCategoryListingList("ALL"));

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
	
	
	public List<Business> getCategoryListingList(String selectedCategory) throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet categoryListingSheet = workbook.getSheet("NxDialAllListing");
		Iterator<Row> categoryRowIterator = categoryListingSheet.rowIterator();
		nxCategoryList.clear();
		while (categoryRowIterator.hasNext()) {
			Row row = categoryRowIterator.next();
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
				String map = (row.getCell(10) == null) ? "": row.getCell(10).toString();	
				String market = (row.getCell(11) == null) ? "": row.getCell(11).toString();	
				String marketMain = (row.getCell(12) == null) ? "": row.getCell(12).toString();
				String specialization = (row.getCell(13) == null) ? "": row.getCell(13).toString();
				
				if("Y".equalsIgnoreCase(active) && (category.equals(selectedCategory) || selectedCategory.equals("ALL"))) {
					
					nxCategoryList.add(new Business(number, active, category, name, address, contactNumber, contactNumberOther,
							website, openTime, imageUrl, map, market, marketMain, specialization));
				}
			}
		}
		//System.out.println("nxCategoryList = "+nxCategoryList);
		//LOGGER.info("nxCategoryList = "+nxCategoryList);
		
		Sheet topList = workbook.getSheet("TopList");
		Iterator<Row> topListIterator = topList.rowIterator();
		int topListNumber = 0;
		while (topListIterator.hasNext()) {
			Row row = topListIterator.next();
			if(row.getCell(0).toString().equals((selectedCategory)))
			{
				String celValue = Character.toString(row.getCell(1).toString().charAt(0));
				topListNumber = Integer.parseInt(celValue);
				break;
			}
		}
		
		if(nxCategoryList.size()>5) {
			Collections.shuffle(nxCategoryList.subList(topListNumber, nxCategoryList.size()));
		}
		
		return nxCategoryList;
	}
	
	public List<Business> getUniqueLocationsListingList(String selectedCategory) throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet categoryListingSheet = workbook.getSheet("NxDialAllListing");
		Iterator<Row> categoryRowIterator = categoryListingSheet.rowIterator();
		nxUniqueLocationsSet.clear();
		while (categoryRowIterator.hasNext()) {
			Row row = categoryRowIterator.next();
			if(row.getRowNum() > 0) {
				String marketMain = (row.getCell(12) == null) ? "": row.getCell(12).toString();	
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();	
				String category = (row.getCell(2) == null) ? "": row.getCell(2).toString();
				if(marketMain != "" && "Y".equalsIgnoreCase(active) && category.equals(selectedCategory)) {
					nxUniqueLocationsSet.add(marketMain);
				}
			}
		}
		List<String> nxUniqueLocations = new ArrayList<String>(nxUniqueLocationsSet);
		Collections.sort(nxUniqueLocations);
		List<Business> uniqueList = new ArrayList<Business>();
		for (String location : nxUniqueLocations)
		{
			Business business = new Business();
			business.setMarketMain(location);
			uniqueList.add(business);
		}
		//System.out.println("nxCategoryList = "+nxCategoryList);
		//LOGGER.info("nxCategoryList = "+nxCategoryList);
		return uniqueList;
	}
	
	
	public List<Business> getUniqueLocationsOfSearchListingList(String selectedCategory) throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();

		List<Business> list = getSearchSiteListingList(selectedCategory);
		Iterator categoryRowIterator = list.iterator();
		
		nxUniqueLocationsOfSearchSet.clear();
		while (categoryRowIterator.hasNext()) {
			Business business = (Business) categoryRowIterator.next();
				nxUniqueLocationsOfSearchSet.add(business.getMarketMain());
			}
		List<String> nxUniqueLocations = new ArrayList<String>(nxUniqueLocationsOfSearchSet);
		Collections.sort(nxUniqueLocations);
		List<Business> uniqueList = new ArrayList<Business>();
		for (String location : nxUniqueLocations)
		{
			Business business = new Business();
			business.setMarketMain(location);
			uniqueList.add(business);
		}
		//System.out.println("nxCategoryList = "+nxCategoryList);
		//LOGGER.info("nxCategoryList = "+nxCategoryList);
		return uniqueList;
	}
	
	
	public List<Business> getDoctorsSpecializationKeyListingList() throws InvalidFormatException, IOException {
		Workbook workbook = getWorkbook();
		Sheet categoryListingSheet = workbook.getSheet("NxDialAllListing");
		Iterator<Row> categoryRowIterator = categoryListingSheet.rowIterator();
		nxUniqueDoctorsSpecializationKeySet.clear();
		while (categoryRowIterator.hasNext()) {
			Row row = categoryRowIterator.next();
			if(row.getRowNum() > 0) {
				String doctorSpecializationKey = (row.getCell(15) == null) ? "": row.getCell(15).toString();	
				String active = (row.getCell(1) == null) ? "": row.getCell(1).toString();	
				if(doctorSpecializationKey != "" && "Y".equalsIgnoreCase(active)) {
					String keyColl[] = doctorSpecializationKey.split(" ");
					for (String key : keyColl)
					{
						nxUniqueDoctorsSpecializationKeySet.add(key);
					}
				}
			}
		}
		List<Business> uniqueList = new ArrayList<Business>();
		for (String specializationKey : nxUniqueDoctorsSpecializationKeySet)
		{
			Business business = new Business();
			business.setSpecializationKey(specializationKey);
			uniqueList.add(business);
		}
		//System.out.println("nxCategoryList = "+nxCategoryList);
		//LOGGER.info("nxCategoryList = "+nxCategoryList);
		return uniqueList;
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
