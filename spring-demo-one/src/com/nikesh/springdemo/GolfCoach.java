package com.nikesh.springdemo;

public class GolfCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public GolfCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getdDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice your skils for 2 hours";
	}

	@Override
	public String getdDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
