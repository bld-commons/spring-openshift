package com.dxc.openshift.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenShiftController {

	
	@GetMapping(path = "/welcome")
	public String welcomeOpenShift() {
		return "Welcome OpenShift";		
	}
	
}
