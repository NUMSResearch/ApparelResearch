package com.research.apparelproject.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Configuration
@EnableAutoConfiguration
@Controller
@RequestMapping("/map")
public class PageController {
	

	@RequestMapping(method = RequestMethod.GET)
	public String Page() {
		return "map";
	}
}
