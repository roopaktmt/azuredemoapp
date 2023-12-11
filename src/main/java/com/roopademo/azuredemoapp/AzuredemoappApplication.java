package com.roopademo.azuredemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzuredemoappApplication {
	
    @GetMapping("/om")
	public String getData() {
		return "OM SAMARTHA SADGURU SAINATH sadhguru sairam";
	}
	public static void main(String[] args) {
		SpringApplication.run(AzuredemoappApplication.class, args);
	}

}
