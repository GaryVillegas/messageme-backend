package com.message.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.message.backend.config.EnvConfig;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		System.out.println("✅ MONGO_URI: " + EnvConfig.get("MONGO_URI"));
        System.out.println("✅ JWT_SECRET: " + EnvConfig.get("JWT_SECRET"));

		SpringApplication.run(BackendApplication.class, args);
	}

}
