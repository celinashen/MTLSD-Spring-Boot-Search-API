package com.example.searchapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DemoApplication {

	public static void main(String[] args) {
	//	System.out.println("celina");
		SpringApplication.run(DemoApplication.class, args);
		
	}

}
