package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping(value = "/test")
	public String demo() {
		return "Test";
	}
	
	@RequestMapping(value = "/test_1")
	public String demo_1() {
		return "Test_1";
	}
}
