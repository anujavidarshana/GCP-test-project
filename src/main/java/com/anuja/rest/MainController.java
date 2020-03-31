package com.anuja.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/hello")
	public String hiMethod() {
		return "GCP Spring boot app working";
	}
}
