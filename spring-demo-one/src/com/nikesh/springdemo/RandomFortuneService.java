package com.nikesh.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	//create array of Strings
	private String[] data = {
			"Beware of the wolf",
			"ABC",
			"DEF"
	};
	
	//create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];		
		return theFortune;
	}

}
