package com.in28minutes.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
	public void up() {
		System.out.println("jump");
	}
}
