package com.shop.util;

import java.util.Arrays;
import java.util.List;

import com.shop.model.Business;
import com.shop.model.Category;
import com.shop.model.CategoryThumbnail;

public class Constant {
	
	// just dial 
	public static String restCaption = "Restaurants";
	public static String docCaption = "Doctors";
	public static String hospCaption = "Hospitals";
	public static String schlCaption = "Schools";
	public static String playSCaption ="PlaySchool";
	public static String chemstCaption ="Chemist";
	public static String perCareCaption = "PersonalCare";
	public static String tourTCaption ="TourTravel";
	public static String realEstCaption ="RealEstate";
	public static String evntCaption ="Events";
	public static String pathLCaption = "PathLabs";
	public static String taxiSCaption = "TaxiServices";
	public static String autoMCaption = "Automobiles";
	public static String dailyNCaption = "DailyNeeds";
	public static String shoppCaption = "Shopping";
	public static String movCaption = "Movies";
	
	public static String adminUserName = "admin";
	public static String adminPassword = "password";
	public static String adminRole = "ADMIN";
	
	public static String DATA_UPLOAD_FILE_PATH = "/com/shop/util/ncData.xlsx";
	
	public static List<Category> nxDirCategoryList = Arrays.asList(
			new Category("RESTAURANTS", restCaption),
			new Category("DOCTORS", docCaption),
			new Category("HOSPITALS", hospCaption),
			new Category("SCHOOLS", schlCaption),
			new Category("PLAY SCHOOLS", playSCaption),
			new Category("CHEMISTS", chemstCaption),
			new Category("PERSONAL CARE", perCareCaption),
			new Category("TOUR & TRAVELS", tourTCaption),
			new Category("REAL ESTATE", realEstCaption),
			new Category("EVENTS", evntCaption),
			new Category("PATH LABS", pathLCaption),
			new Category("TAXI SERVICES", taxiSCaption),
			new Category("AUTOMOBILES", autoMCaption),
			new Category("DAILY NEEDS", dailyNCaption),
			new Category("SHOPPING", shoppCaption),
			new Category("MOVIES", movCaption)
			);
	
	public static List<CategoryThumbnail> nxCategoryThumbnailList = Arrays.asList(
			new CategoryThumbnail(restCaption, "/img/thumbnail/restaurantsThumbnail.jpeg"),
			new CategoryThumbnail(docCaption, "/img/thumbnail/doctorsThumbnail.jpeg"),
			new CategoryThumbnail(hospCaption, "/img/thumbnail/hospitalsThumbnail.jpeg"),
			new CategoryThumbnail(perCareCaption, "/img/thumbnail/personalCareThumbnail.jpeg"),
			new CategoryThumbnail(autoMCaption, "/img/thumbnail/automobilesThumbnail.jpeg"),
			new CategoryThumbnail(schlCaption, "/img/thumbnail/schoolsThumbnail.jpeg"),
			new CategoryThumbnail(pathLCaption, "/img/thumbnail/pathlabsThumbnail.jpeg"),
			new CategoryThumbnail(taxiSCaption, "/img/thumbnail/taxiServicesThumbnail.jpeg"),
			new CategoryThumbnail(movCaption, "/img/thumbnail/moviesThumbnail.jpeg"),
			new CategoryThumbnail(dailyNCaption, "/img/thumbnail/dailyNeedsThumbnail.jpeg"),
			new CategoryThumbnail(shoppCaption, "/img/thumbnail/shoppingThumbnail.jpeg")
			);
		
	/*public static List<Business> nxRestaurantsListingList = Arrays.asList(
			new Business("Mirch Masala Chinese Fast Food", "Shop No. 10, Lower Ground, City Plaza Market, Gaur City-I, Noida Extension West, Uttar Pradesh 201309", 
					"09810686697", "N/A", "N/A", "/img/restaurant/restaurant_mirchMasalaChineseFastFood.jpeg"),
			new Business("Mittran Di Hatti", "Shop No. 150, F.F, City Plaza, Gaur City, Noida Extension, Uttar Pradesh 201308​", 
					"09582989939​", "N/A", "N/A", "/img/restaurant/restaurant_mittranDiHatti.png"),
			new Business("Punjabi Rasoi", "Iteda T-Point, Greater Noida, Uttar Pradesh 201009​", 
					"09560229275, 08588858840", "N/A", "N/A", "/img/restaurant/restaurant_punjabiRasoi.png"),
			new Business("The Dhaba", "SF-11, 2nd Floor, Galleria Market, Crossing Republik, Ghaziabad, Uttar Pradesh 201009​", 
					"08130833663, 08130733663", "N/A", "N/A", "/img/restaurant/restaurant_theDhaba.png"),
			new Business("U.S.Pizza", "Shop no.27, City Plaza, Gaur City-1, Noida Extn., NOIDA, Uttar Pradesh 201009", 
					"01207162530", "N/A", "N/A", "/img/restaurant/restaurant_usPizza.png"),
			new Business("Barbeque Express", "Shop.No.gf-26,City Galleria, Gaur City - 2, Greater Noida, Uttar Pradesh 201301​", 
					"09650692920", "N/A", "N/A", "/img/restaurant/restaurant_barbequeExpress.png"),
			new Business("Breads & Curries", "FF -154 GAUR CITY PLAZA ,GAUR CITY ONE ,GR. WEST-201009, Noida, Uttar Pradesh​", 
					"01206955553", "N/A", "N/A", "/img/restaurant/restaurant_breadsCurries.png"),
			new Business("Hungry Hope", "Shop.No.24,LGF, Gaur Galleria Market, Gaur City -2, Greater Noida, Uttar Pradesh 201301​", 
					"08588003170", "N/A", "N/A", "/img/restaurant/restaurant_hungryHope.png"),
			new Business("Shree Rathnam", "Hall No 5, Tower-E, Gauri Global, Village Crossing Republic, Ghaziabad, Uttar Pradesh 201016​", 
					"01202986550", "N/A", "N/A", "/img/restaurant/restaurant_shreeRathnam.png"),
			new Business("La-Cuisine", "LGF 2, Galleria Market, Crossings Republik, Ghaziabad, Uttar Pradesh 201016​", 
					"09582388876", "N/A", "N/A", "/img/restaurant/restaurant_laCuisine.png"),
			new Business("Chulha Kitchen Restaurant", "1405,, 10th Ave, Gaur City 2, Ghaziabad, Uttar Pradesh 201009​", 
					"09654453478", "N/A", "N/A", "/img/restaurant/restaurant_chulhaKitchenRestaurant.png"),
			new Business("Pizza Hut", "Shop No 7, Paramount Symphony, Crossing Republik, Ghaziabad, Uttar Pradesh 201016​", 
					"01139883988", "N/A", "N/A", "/img/restaurant/restaurant_pizzaHut.png"),
			new Business("Punjab Chicken Corner", "Shop No.LG-56, City Plaza, Gaur City-I, Sector-4, Greater Noida West, Uttar Pradesh 201309​", 
					"07042779923", "N/A", "N/A", "/img/restaurant/restaurant_punjabChickenCorner.png")
			);
	
	public static List<Business> nxHospitalsListingList = Arrays.asList(
			new Business("Vrandavan Hospital", "Vrandavan Garden, Main Crossing Noida, Crossing Republic Rd, Shahberi, Greater Noida, Uttar Pradesh 201009", 
					"01202845880", "N/A", "N/A", "/img/hospitals/hospital_vrandavanHospital.png"),
			new Business("Adyan Ultrasound", "Crossings Republik Rd, Crossings Republik, Ghaziabad, Uttar Pradesh 201009​", 
					"08130470340​", "N/A", "N/A", ""),
			new Business("Ortho Neuro", "Emerald, Ajnara Gen-X, Crossing Republic, Gaziabad- 201016,Crossings Republik Rd, Dundahera, Ghaziabad, Uttar Pradesh 201016​", 
					"08130470340, 08588858840", "N/A", "N/A", ""),
			new Business("Dental Pearls", "Supertech Livingston Block A, F-2403,, Crossings Republik, Ghaziabad, Uttar Pradesh 201016", 
					"09643958619", "N/A", "N/A", ""),
			new Business("EyeCure Hospital", "FF 101, PANCHSHEEL SQUARE, CROSSING REPUBLIK, Ghaziabad, Uttar Pradesh 201016", 
					"08800254055", "N/A", "N/A", ""),
			new Business("Valentus Health Care Clinic", "Inner Circle, Gaur Global Village Adjacent To Bank Of Baroda, Crossings Republik, Ghaziabad, Uttar Pradesh 201016​", 
					"09650927711", "N/A", "N/A", "/img/hospitals/hospital_valentusPrakashFamilyHealthClinic​.png"),
			new Business("Crossings Smile Dental Clinic​", "SHOP FF-8A,Crossing Plaza(Galleria-2), CROSSING REPUBLIK, Biharipur Village, Crossings Republik, Ghaziabad, Uttar Pradesh 201013", 
					"07827375702, 07503630081", "N/A", "N/A", ""),
			new Business("Crossing's Smile (Child Care Clinic)", "Shop No. 9A, First Floor, Galleria-2, Crossing Republic, Ghaziabad, Uttar Pradesh 201016​​", 
					"09911794359, 09013887837", "N/A", "N/A", ""),
			new Business("Valentus Prakash Family Health Clinic​", "Gaur global village, GF 05, Crossing Republik, Ghaziabad - 201016, Near bank of baroda", 
					"9540097282, 9650830011, 9540097282", "N/A", "N/A", ""),
			new Business("ORO - Dental Clinic​ & Implant Centre", "Shop no 25, Ground Floor, City Plaza, Gaur City-1, Greater Noida West, Ghaziabad, UP 201316", 
					"9599065099, 9717104804", "N/A", "N/A", "/img/hospitals/hospital_ORODentalClinic.jpg"),
			new Business("Dr Garg's Orthopaedic Dental Clinic", "409, Orbit Plaza, Crossing Republic, Near Domino's & more Superstore​", 
					"9910554446", "N/A", "N/A", ""),
			new Business("Tooth Care & Cure", "Shop No: GF-07, City Plaza, Gaur City 1, Greater Noida West, Uttar Pradesh 201308​", 
					"9528865376", "N/A", "N/A", "/img/hospitals/hospital_toothCare&Cure.jpg"),
			new Business("Dharm Dental Clinic", "202, Panchsheel Square, Crossings Republik, Ghaziabad, Uttar Pradesh 201009", 
					"9899623485", "N/A", "N/A", "/img/hospitals/hospital_dharmDentalClinic.jpg")
			);*/
	
}
