package com.mfsr.clearfriendships;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClearfriendshipsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClearfriendshipsApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(){
		return args -> {

		};
	}
}
