package com.cjc.RedBus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedBusApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedBusApplication.class, args);
		System.out.println("main method added");
	}
	public Void m1()
	{
		System.out.println("This is m1 method added");
	}

}
