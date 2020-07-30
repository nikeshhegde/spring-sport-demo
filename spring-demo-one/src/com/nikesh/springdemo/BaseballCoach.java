package com.nikesh.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getdDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getdDailyFortune() {
		//use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}
}
 