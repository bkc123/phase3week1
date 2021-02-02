package com.example.phase3week1.service;

import java.util.ArrayList;
import java.util.List;

import com.example.phase3week1.model.*;

public class UserService {
	private UserRepository userRepository;

	public List<User> retriveUser(String user){
		List<User> filterUser = new ArrayList<User>();
		Iterable<User> users = userRepository.findAll();
		
		for (User thisuser : users) {
			if (thisuser.getName().equals(user)) {
				
			}
		}
		
		return filterUser;
	}
	
	public Iterable<User> retriveAllUsers(){
		return userRepository.findAll();
	}
}
