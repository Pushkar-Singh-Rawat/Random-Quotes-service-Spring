package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration // java based configuration is being done.
public class RandomQuotesConfig {

	// private ChuckNorrisQuotes chuckNorrisQuotes;

	@Bean //this bean gets injected by Spring f/w run time environment into RandomQuotesController.
	public ChuckNorrisQuotes getChuckNorrisQuotes() {

		return new ChuckNorrisQuotes();
	}
}
