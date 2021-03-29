package com.codingdojo.routingpractice.ninjagold.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String homePage(HttpSession session,  Model model) {
		ArrayList<String> activities = new ArrayList<String>();
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		if(session.getAttribute("activities") == null) {
			session.setAttribute("activities", activities);
		}
		model.addAttribute("totalGold", session.getAttribute("gold"));
		model.addAttribute("activities", session.getAttribute("activities"));
		return "index.jsp";
	}
	
	@PostMapping("/Gold") 
	public String ninjaGold(HttpSession session, @RequestParam("building")String building) {
		Random r = new Random();
		int gold = (int) session.getAttribute("gold");
		int goldFound;
		ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities");
		LocalDateTime currentTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YYYY h:mma");
		String formattedTime = currentTime.format(formatter);
		if(building.equals("farm")) {
			goldFound = r.nextInt((20 - 10 ) + 1) + 10;
			activities.add(String.format("You scavaged a farm and found %d gold! %s", goldFound, formattedTime));
		} else if(building.equals("cave")) {
			goldFound = r.nextInt((10-5) + 1) + 5;
			activities.add(String.format("You entered a cave and found %d gold! %s", goldFound, formattedTime));
		}else if(building.equals("house")) {
			goldFound = r.nextInt((5-2) + 1) + 2;
			activities.add(String.format("You plundered a house and found %d gold! %s", goldFound, formattedTime));
		} else{
			goldFound = r.nextInt((50+50) +1) - 50;
			if(goldFound < 0) {
				activities.add(String.format("You try your luck and lost %d gold in the casino! %s", goldFound, formattedTime));
			} else {
				activities.add(String.format("You try your luck and won %d gold in the casino! %s", goldFound, formattedTime));
			}
		}
		
		int totalGold = gold += goldFound;
		session.setAttribute("gold", totalGold);
		session.setAttribute("activities", activities);
		return "redirect:/";
	}
}
