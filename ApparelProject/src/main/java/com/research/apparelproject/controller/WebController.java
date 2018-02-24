package com.research.apparelproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WebController {

	@GetMapping("/hi")
	public String index(){
		return "welcome";
	}
	
	@GetMapping("/test")
	public String Test(){
		return "Hiiiii";
	}
	
}
