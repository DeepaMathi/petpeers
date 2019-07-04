package com.example.petpeers.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petpeers.entity.User;
import com.example.petpeers.service.IUserService;

@RestController
@RequestMapping
public class UserController {

	@Autowired
	IUserService userService;

	@GetMapping("/users/getAll")
	public ArrayList<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/users/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);

	}

}
