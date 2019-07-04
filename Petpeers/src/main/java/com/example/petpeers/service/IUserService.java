package com.example.petpeers.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.petpeers.entity.User;

@Service
public interface IUserService {

	public User addUser(User user) ;
 	public ArrayList<User> getAllUsers();	
}
