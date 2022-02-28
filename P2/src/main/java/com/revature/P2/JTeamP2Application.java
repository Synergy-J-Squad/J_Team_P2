package com.revature.P2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.revature.repositories")
@EntityScan("com.revature.models")
@ComponentScan("com.revature")

public class JTeamP2Application {

	public static void main(String[] args) {
		SpringApplication.run(JTeamP2Application.class, args);
	}

}
