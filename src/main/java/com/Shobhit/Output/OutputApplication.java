package com.Shobhit.Output;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OutputApplication implements CommandLineRunner {

	@Autowired
	apple obj;
	public static void main(String[] args) {
		SpringApplication.run(OutputApplication.class, args);

//		=new apple();
//		obj.eatApple();

	}

	@Override
	public void run(String... args) throws Exception {
		obj.eatApple();
	}
}
