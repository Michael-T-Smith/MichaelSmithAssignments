package com.codingdojo.routingpractice.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class mainController {
	@RequestMapping("")
	public String homePage() {
		return "index.jsp";
	}
	@RequestMapping(path="/", method=RequestMethod.POST)
	public String codeAttempt(@RequestParam(value="passcode") String passcode, Model model, RedirectAttributes redirectAtt) {
		if(passcode.equals("bushido")) {
			return "redirect:/code";
		} 
			redirectAtt.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
	}
}

