package com.tranza.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	/**
	 * Access to the index or home page
	 * */
	
	@RequestMapping(value = { "/", "home", "index", "default" })
	public ModelAndView index() {
		
		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("title", "Home");
		
		
		
		return modelAndView;
		
	}

}
