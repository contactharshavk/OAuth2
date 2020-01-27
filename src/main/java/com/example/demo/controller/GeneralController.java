package com.example.demo.controller;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
public class GeneralController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello World";
	}
	
	@GetMapping("/news")
	public String getNews() {
		return "Hello World take your News!!!";
	}
	
	@GetMapping("/")
	public String getHomePage() {
		return "Hello You are in Home Page";
	}
}
