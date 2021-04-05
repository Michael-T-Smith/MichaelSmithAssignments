package com.michaelsmith.lookify.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.michaelsmith.lookify.models.Song;
import com.michaelsmith.lookify.services.SongService;

@Controller
public class SongController {
	//intialize services
	private final SongService songService;
	public SongController(SongService service) {
		songService = service;
	}
	//home page
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String homePage() {
		return "index.jsp";
	}
	
	//dashboard
	@RequestMapping(path="/dashboard", method=RequestMethod.GET)
	public String dashboard(Model model) {
		model.addAttribute("song", songService.allSongs());
		return "dashboard.jsp";
	}
	
	// add a song
	@RequestMapping(path="/songs/new", method=RequestMethod.GET)
	public String newSong(@ModelAttribute("song") Song song) {
		return "/songs/new.jsp";
	}
	
	@RequestMapping(path="/songs/new", method=RequestMethod.POST)
	public String addSong(@Valid @ModelAttribute("song")Song song, BindingResult result, @RequestParam Map <String, String> body) {
		if(result.hasErrors())
			return "/songs/new.jsp";
		songService.createSong(song);
		return "redirect:/dashboard";
	} 
	
	//delete song of dashboard
	@RequestMapping(value="/songDelete/{id}", method= {RequestMethod.DELETE, RequestMethod.POST})
	public String delete(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	//details page
	@RequestMapping("/songs/details/{id}")
	public String details(@PathVariable("id") Long id, Model model) {
		model.addAttribute("song", songService.findSong(id));
		return "/songs/details.jsp";
	}
	
	//topten page.
	@RequestMapping("/search/topTen")
	public String topTen(Model model) {
		model.addAttribute("song", songService.allSongs());
		return "/search/topten.jsp";
	}

}
