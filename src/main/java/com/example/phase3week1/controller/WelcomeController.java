package com.example.phase3week1.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@Value("${welcome.,essage:test}")
	private String message = "Hello Wordl";
	
	@RequestMapping("/")
	public String Welcome (Map<String,Object> model) {
		
		
		logger.info("In the welcome!");
		model.put("Message", this.message);
		return "welcome";
	}
	@RequestMapping("/welcome")
	public String Welcome2(Map<String,Object> model) {
		
		
		logger.info("In the welcome!");
		model.put("Message", this.message);
		return "welcome";
	}

}
