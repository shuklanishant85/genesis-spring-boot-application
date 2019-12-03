package com.boot.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	@Value("${spring.application.name}")
	String appName;
	
	@GetMapping("/")
	public String getHomePage(Model model) {
		model.addAttribute("appName", appName);
		return "home";
	}
	
}
