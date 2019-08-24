package com.hiscox.demo.quotebind.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.hiscox.demo.quotebind.model.User;

@Service
public class DbInit implements CommandLineRunner{

	private UserRepository userRepository;
	
	public DbInit(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public void run(String... args) {
		// Create users
        User user1 = new User("david","dan123","USER","");
        User admin = new User("admin","admin123","ADMIN","ACCESS_TEST1,ACCESS_TEST2");
        User manager = new User("manager","manager123","MANAGER","ACCESS_TEST1");

        List<User> users = Arrays.asList(user1,admin,manager);

        this.userRepository.saveAll(users);
	}
}
