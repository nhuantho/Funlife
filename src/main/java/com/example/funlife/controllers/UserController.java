package com.example.funlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.User;
import com.example.funlife.services.UserSevice;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserController {
	@Autowired 
	private UserSevice userSevice;
	
	@PostMapping(path = "/addUser")
	public User Add(@RequestBody User user) {
		return userSevice.Add(user);
	}
	
	@PostMapping(path = "/addUsers")
	public List<User> Add(@RequestBody List<User> users) {
		return userSevice.AddAll(users);
	}
	
	@GetMapping(path = "/getAllUsers")
	public List<User> GetAll(){
		return userSevice.GetAll();
	}
	
	@PostMapping(path = "/checkUser")
	public List<User> CheckUser(@RequestBody User user){
		return userSevice.CheckUser(user);
	}
	
	@PutMapping(path = "/updateUser")
	public User Update(@RequestBody User user) {
		return userSevice.Update(user);	
	}
	
	@DeleteMapping(path = "/deleteUser/{username}")
	public String Delete(@PathVariable String username) {
		return userSevice.Delete(username);
	}
}
