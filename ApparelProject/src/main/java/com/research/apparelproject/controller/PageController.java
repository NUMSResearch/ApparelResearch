package com.research.apparelproject.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Configuration
@EnableAutoConfiguration
@Controller
/*@RequestMapping("/map")*/
public class PageController {
	
	@RequestMapping("/")
	public ModelAndView index () {
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("map");
	    return modelAndView;
	}

/*	@RequestMapping(method = RequestMethod.GET)
	public String Page() {
		String a ="Malinda";
		System.out.println(a);
		return "map";
	}*/
}
