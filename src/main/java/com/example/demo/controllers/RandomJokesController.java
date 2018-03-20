package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.services.RandomJokeService;

@Controller
public class RandomJokesController {

	private RandomJokeService randomJokeService;
	@Autowired //annotating DI via constructor is optional though.
	RandomJokesController(RandomJokeService randomJokeService){
		this.randomJokeService=randomJokeService;
	}
	
	@RequestMapping({"/",""})
	public String getRandomJoke(Model model) {
		model.addAttribute("Quote",randomJokeService.randomJoke());
		return "Quotes";
	}
	
}
