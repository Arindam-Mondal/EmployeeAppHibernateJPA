package com.howtodoinjava.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String redirectController(){
		System.out.println("Inside redirectController");
		return "redirect:/employee-module";
	}
}
