package com.naren.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day! DatabaseFortuneService";
	}

}
