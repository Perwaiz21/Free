package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping(value = "/test")
	public String getTest() {
		return "Hi";
	}
	
	@RequestMapping(value = "/test-1")
	public String getTest_1() {
		return "Hi";
	}
	
}
