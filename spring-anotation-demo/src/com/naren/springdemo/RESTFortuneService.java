package com.naren.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day! RESTFortuneService";
	}

}
