package com.shop.controller;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.shop.util.CacheNxData;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
//@RequestMapping(value="shop")
public class HomeController {
	
	@Autowired
    CacheNxData cacheNxData;

	@RequestMapping(value = "shop", method=RequestMethod.GET)
	public ModelAndView home() throws InvalidFormatException, IOException {
		cacheNxData.loadData();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("key", "home");
		modelAndView.setViewName("home");
		return modelAndView;
	}
	
}
