package com.example.demo.controller;

import java.security.Principal;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
public class SecuredController {

	@GetMapping("/user")
	public Principal user(Principal principal) {
		return principal;
	}
}
