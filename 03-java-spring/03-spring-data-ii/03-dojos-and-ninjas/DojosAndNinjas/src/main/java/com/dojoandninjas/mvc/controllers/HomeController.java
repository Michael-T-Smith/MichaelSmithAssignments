package com.dojoandninjas.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojoandninjas.mvc.models.Dojo;
import com.dojoandninjas.mvc.models.Ninja;
import com.dojoandninjas.mvc.services.DojoService;
import com.dojoandninjas.mvc.services.NinjaService;

@Controller
public class HomeController {
	private NinjaService nService;
	private DojoService dService;
	
	
	
	public HomeController(DojoService service, NinjaService nService) {
		this.dService = service;
		this.nService = nService;
	}
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/dojos/newDojo")
	public String createDojoPage(@ModelAttribute("dojo") Dojo dojo, Model viewModel) {
		viewModel.addAttribute("dojo", dojo);
		return "/dojos/newDojo.jsp";
	}
	
	@PostMapping("/dojos/createDojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, Model viewModel, BindingResult result) {
		if(result.hasErrors())
			return "/dojos/newDojo";
		this.dService.createDojo(dojo);
		return "redirect:/";
	}
	
	@GetMapping("/dojos/locations")
	public String showDojos(Model viewModel) {
		List<Dojo> dojos = this.dService.getAllDojos();
		viewModel.addAttribute("dojos", dojos);
		return "/dojos/locations.jsp";
	}
	
	
	@GetMapping("/dojos/{id}")
	public String showNinjas(@PathVariable("id") Long id, Model viewModel) {
		List<Ninja> ninja = this.nService.getAllNinjas();
		viewModel.addAttribute("ninja", ninja);
		viewModel.addAttribute("dojo", this.dService.getDojoById(id));
		return "/ninjas/showNinjas.jsp";
	}
	
	@GetMapping("/ninjas/addNinja")
	public String addNinja(@ModelAttribute("dojos") Dojo dojo,@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		List<Dojo> dojos = this.dService.getAllDojos();
		viewModel.addAttribute("dojos", dojos);
		List<Ninja> ninjas = this.nService.getAllNinjas();
		viewModel.addAttribute("ninjas", ninjas);
		return "/ninjas/addNinja.jsp";
	}
	
	@PostMapping("/ninjas/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors())
			return"/ninjas/addNinja";
		this.nService.createNinja(ninja);
		return "redirect:/";
	}
	
	
	
	
	
	
}
