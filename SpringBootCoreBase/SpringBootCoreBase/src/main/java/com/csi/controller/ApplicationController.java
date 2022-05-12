package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {
	
	@GetMapping
	public String sayHello() {
		return "WELCOME TO FINTECH CSI PUNE";
	}
	
	@GetMapping("/address")
	public String sayAddress() {
		return "PUNE";
	}
	
	@GetMapping("/services")
	public String sayServices() {
		return "SOFTWARE SERVICES";
	}
	

	@GetMapping("/details")
	public String sayDetails() {
		return "SOFTWARE ENGINEERING";
	}
	
	

}
