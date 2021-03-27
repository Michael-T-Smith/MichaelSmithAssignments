package com.codingdojo.routingpractice.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homePage() {
		return "Index.jsp";
	}
	
	@RequestMapping("/result")
	public String resultPage(Model model, @RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="language") String language, @RequestParam(value="comment") String comment) {
		model.addAttribute("name",name);
		model.addAttribute("location",location);
		model.addAttribute("language",language);
		model.addAttribute("comment",comment);
		return "result.jsp";
	}
}
