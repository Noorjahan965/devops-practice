package com.example.demo;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrenyServiceConfiguration configuration;
	
	@RequestMapping("/currency-configuration") 
	public CurrenyServiceConfiguration retrieveAllCourses(){
		return configuration;
	}

}
