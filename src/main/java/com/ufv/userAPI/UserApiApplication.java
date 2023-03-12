package com.ufv.userAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApiApplication {

	public static void main(String[] args) {
		Cliente c= new Cliente();

		SpringApplication.run(UserApiApplication.class, args);
	}

}
