package com.example.buildEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BuildExApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildExApplication.class, args);
	}

}
