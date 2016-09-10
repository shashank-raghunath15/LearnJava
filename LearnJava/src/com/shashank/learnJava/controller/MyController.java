package com.shashank.learnJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/hello/{name}")
	public ModelAndView hello(@PathVariable("name") String name){
		ModelAndView model = new ModelAndView("hello");
		model.addObject("hello", "Hellow World");
		model.addObject("name", name);
		return model;
	}
}
