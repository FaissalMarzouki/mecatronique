package com.Mecatronique.Faissal;

import java.time.LocalDate;
import java.util.Date;

import com.Mecatronique.Faissal.entity.Role;
import com.Mecatronique.Faissal.entity.User;
import com.Mecatronique.Faissal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication
public class BackendWebsiteApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(BackendWebsiteApplication.class, args);
	}


	@Override
	public void run(String... args){
		User adminAccont = userRepository.findByRole(Role.ADMIN);
		if(adminAccont == null){
			User user = new User();
			user.setUserId("1");
			user.setEmail("admin@email.ma");
			user.setFirstName("Faissal");
			user.setLastName("Marzouki");
			user.setRole(Role.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("1447"));
			userRepository.save(user);
		}
	}
}
