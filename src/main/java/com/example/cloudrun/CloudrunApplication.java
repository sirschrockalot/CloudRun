package com.example.cloudrun;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController(value = "/cloudrun")
public class CloudrunApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudrunApplication.class, args);
	}

	private String testController(){
		Gson gson = new Gson();
		return gson.toJson("Working");
	}
}
