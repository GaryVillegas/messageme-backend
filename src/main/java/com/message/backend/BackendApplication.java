package com.message.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		//TODO: Create chat room with websocket
		//TODO: P2P Manage with websocket
		//TODO: Voice message manage
		//TODO: Deploid to docket

		Dotenv dotenv = Dotenv.configure()
        .filename(".env")
        .ignoreIfMissing()
        .load();
		// System.setProperty("MONGO_URI", dotenv.get("MONGO_URI"));
		// System.setProperty("JWT_SECRET", dotenv.get("JWT_SECRET"));
		dotenv.get("MONGO_URI");
		dotenv.get("JWT_SECRET");

		SpringApplication.run(BackendApplication.class, args);
	}

}
