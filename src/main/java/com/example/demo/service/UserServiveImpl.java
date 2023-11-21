package com.example.demo.service;


import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.web.dto.UserRegistraionDto;

@Service
public class UserServiveImpl implements UserService{
	
	
	private UserRepository userRepository;

	public UserServiveImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	public User save(UserRegistraionDto registraionDto) {
		User user = new User(registraionDto.getFirstName(),
				registraionDto.getLastName(), 
				registraionDto.getEmail(), 
				registraionDto.getPassword(),
				Arrays.asList(new Role("ROLE USER")));
		
		return userRepository.save(user);
	}

	
	

	

}
