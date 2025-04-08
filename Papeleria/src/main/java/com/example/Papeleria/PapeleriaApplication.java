package com.example.Papeleria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.cdimascio.dotenv.Dotenv;


@SpringBootApplication
public class PapeleriaApplication {

	public static void main(String[] args) {
		loadEnv();
		SpringApplication.run(PapeleriaApplication.class, args);
	}

	private static void loadEnv(){
		Dotenv dotenv = Dotenv.load();
		System.setProperty("DB_URL",dotenv.get("DB_URL"));
		System.setProperty("DB_USERNAME",dotenv.get("DB_USERNAME"));
		System.setProperty("DB_PASSWORD",dotenv.get("DB_PASSWORD"));
	}

}
