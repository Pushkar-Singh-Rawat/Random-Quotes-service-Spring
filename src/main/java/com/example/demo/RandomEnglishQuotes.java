package com.example.demo;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomEnglishQuotes {

	private List<String> randomQuote;

	public RandomEnglishQuotes() {
		randomQuote.add("randomJoke1");
		randomQuote.add("randomJoke2");
		randomQuote.add("randomJoke4");
		randomQuote.add("randomJoke3");
		randomQuote.add("randomJoke5");
		randomQuote.add("randomJoke6");
		randomQuote.add("randomJoke7");
		randomQuote.add("randomJoke8");
		randomQuote.add("randomJoke9");
		randomQuote.add("randomJoke10");
		randomQuote.add("randomJoke11");
		randomQuote.add("randomJoke12");
		randomQuote.add("randomJoke13");

		randomQuote.add("randomJoke14");
		randomQuote.add("randomJoke15");
		randomQuote.add("randomJoke16");
		randomQuote.add("randomJoke17");
		randomQuote.add("randomJoke18");
		randomQuote.add("randomJoke19");
		randomQuote.add("randomJoke20");
		randomQuote.add("randomJoke21");
		randomQuote.add("randomJoke22");
		randomQuote.add("randomJoke23");
		randomQuote.add("randomJoke24");

	}
	public String getRandomEnglishQuote() {
		return randomQuote.get(ThreadLocalRandom.current().nextInt(1,randomQuote.size()));
	}
}
