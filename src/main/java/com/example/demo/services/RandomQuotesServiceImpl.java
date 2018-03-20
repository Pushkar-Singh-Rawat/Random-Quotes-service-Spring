package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.services.RandomEnglishQuotes;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class RandomQuotesServiceImpl implements RandomQuotesService {

	// private final RandomEnglishQuotes randomEnglishQuotes;
	private final ChuckNorrisQuotes chuckNorrisQuotes;

	
	public RandomQuotesServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) { //dependency injection is being done
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}


	/*public RandomQuotesServiceImpl() {
		//this.randomEnglishQuotes = new RandomEnglishQuotes();
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}*/

	@Override
	public String randomQuote() {
		// TODO Auto-generated method stub
		//return randomEnglishQuotes.getRandomEnglishQuote();
		return chuckNorrisQuotes.getRandomQuote();
	}

}
