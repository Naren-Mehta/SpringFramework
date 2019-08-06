package com.naren.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] str= {"My Name is Naren",
			"Yo Yo honey singh",
			"Sare jaha se accha"};
	
	
	//create a random number generator
	
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
			int index= myRandom.nextInt(str.length);
			
			String theFortune= str[index];
			return theFortune;
	}

}
