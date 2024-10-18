package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EntityScan(basePackages = "mentorialoja.model")
@ComponentScan(basePackages = {"mentorialoja.*"})
@EnableJpaRepositories(basePackages = {"mentorialoja.repository"})
@EnableTransactionManagement
public class mentorialojaapp {
	public static void main(String[] args) {

		//System.out.println(new BCryptPasswordEncoder().encode("123"));
		SpringApplication.run(mentorialojaapp.class, args);

	}

}
