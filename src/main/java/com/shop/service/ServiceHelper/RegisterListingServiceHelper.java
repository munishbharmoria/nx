package com.shop.service.ServiceHelper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class RegisterListingServiceHelper {
	
	public String uploadListingForApproval(String listingValues)
	{

	    try { 
			String filePath = "C:\\MunishData\\mp\\project\\workspace\\shop\\shop\\src\\main\\resources\\listingApproval\\"+(new Date()).toString().replaceAll(":", "_").replaceAll(" ", "_")+".txt";
			//String filePath = "/munish/nx/listingApproval/"+(new Date()).toString().replaceAll(":", "_").replaceAll(" ", "_")+".txt";
			BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
		    writer.write(listingValues);
		    writer.close();
	    } 
	    catch (IOException e) { 
	        // TODO Auto-generated catch block 
	        e.printStackTrace(); 
	    } 		
		return "success";
		
	}
}
