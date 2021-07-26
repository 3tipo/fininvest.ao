package com.bolsadeideias.springboot.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.bolsadeideias.springboot.app.repo.UserRepository;

@SpringBootApplication
public class SgbdfininvestgroupApplication implements CommandLineRunner{
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository userrepo;

	public static void main(String[] args) {
		SpringApplication.run(SgbdfininvestgroupApplication.class, args);
	}

	String password = "1234";
	@Override
	public void run(String... args) throws Exception {
		/*userrepo.deleteAll();
		
		for (int i = 0; i < 2; i++) {
			String passwordEncriptada= passwordEncoder.encode(password);
			System.err.println(passwordEncriptada);
		}
		*/
		
	}

}
