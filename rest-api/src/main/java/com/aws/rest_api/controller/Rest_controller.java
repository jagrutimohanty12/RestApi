package com.aws.rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest_controller {
	
	@GetMapping("welcome")
	public String welcome()
	{
		return "Hello Jagruti";
	}

}
