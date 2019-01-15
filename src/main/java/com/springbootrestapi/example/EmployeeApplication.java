package com.springbootrestapi.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmployeeApplication {

	public static void Main(String[] args)
	{
		SpringApplication.run(EmployeeApplication.class, args);
		}
	
}
