package com.Mecatronique.Faissal;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
public class BackendWebsiteApplication {


	public static void main(String[] args) {
		SpringApplication.run(BackendWebsiteApplication.class, args);
	}
	 

}
