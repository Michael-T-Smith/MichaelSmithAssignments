package com.codingdojo.routingpractice.HelloHuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homePage(Model model) {
		model.addAttribute("name", "Michael");
		return "Index.jsp";
	}
}
