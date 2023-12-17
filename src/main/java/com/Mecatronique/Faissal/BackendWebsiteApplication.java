package com.Mecatronique.Faissal;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.Mecatronique.Faissal.repository.ProjectRepository;

@SpringBootApplication
@EnableMongoRepositories
public class BackendWebsiteApplication implements CommandLineRunner {

	 @Autowired
    ProjectRepository projectRepository;
	public static void main(String[] args) {
		SpringApplication.run(BackendWebsiteApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		return;

}
	 

}
