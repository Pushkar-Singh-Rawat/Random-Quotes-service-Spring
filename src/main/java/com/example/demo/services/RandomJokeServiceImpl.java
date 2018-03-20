package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.RandomEnglishQuotes;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class RandomJokeServiceImpl implements RandomJokeService {

	// private final RandomEnglishQuotes randomEnglishQuotes;
	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public RandomJokeServiceImpl() {
		//this.randomEnglishQuotes = new RandomEnglishQuotes();
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String randomJoke() {
		// TODO Auto-generated method stub
		//return randomEnglishQuotes.getRandomEnglishQuote();
		return chuckNorrisQuotes.getRandomQuote();
	}

}
