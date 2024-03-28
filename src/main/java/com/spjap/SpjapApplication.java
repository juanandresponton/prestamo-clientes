package com.spjap;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
//public class SpjapApplication {

	//public static void main(String[] args) {
		//SpringApplication.run(SpjapApplication.class, args);
	//}

//}

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@SpringBootApplication
public class SpjapApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpjapApplication.class, args);
	}

}