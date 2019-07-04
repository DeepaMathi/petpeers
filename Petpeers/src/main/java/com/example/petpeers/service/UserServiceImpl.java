package com.example.petpeers.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petpeers.entity.User;
import com.example.petpeers.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserRepository userRepo;

	@Override
	public User addUser(User userBean) {
		User user = userRepo.save(userBean);
		return user;
	}

	@Override
	public ArrayList<User> getAllUsers() {
		ArrayList<User> userList = (ArrayList<User>) userRepo.findAll();
		return userList;
	}

}
