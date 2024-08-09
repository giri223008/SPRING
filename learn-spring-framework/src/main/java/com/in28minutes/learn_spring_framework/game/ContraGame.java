package com.in28minutes.learn_spring_framework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContraGame implements GamingConsole{
	public void up() {
		System.out.println("shoot the bullet");
	}
}
