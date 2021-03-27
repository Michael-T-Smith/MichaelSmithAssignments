package com.codingdojo.routingpractice.counter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String startCount(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		Integer currentCount = (Integer) session.getAttribute("count");
		currentCount++;
		session.setAttribute("count", currentCount++);
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String counterPage(HttpSession session) {
		
		return "counterPage.jsp";
	}
}
