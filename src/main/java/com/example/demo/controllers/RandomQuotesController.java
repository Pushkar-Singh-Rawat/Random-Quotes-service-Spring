package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.services.RandomQuotesService;

@Controller
public class RandomQuotesController {

	private RandomQuotesService randomQuotesService;
	@Autowired //annotating DI via constructor is optional though.
	RandomQuotesController(RandomQuotesService randomQuotesService){
		this.randomQuotesService=randomQuotesService;
	}
	
	@RequestMapping({"/",""})
	public String getRandomQuotes(Model model) {
		model.addAttribute("Quote",randomQuotesService.randomQuote());
		return "Quotes";
	}
	
}
