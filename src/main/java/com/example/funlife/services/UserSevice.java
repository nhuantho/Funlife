package com.example.funlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.funlife.models.User;
import com.example.funlife.responitorys.UserResponitory;

@Service
public class UserSevice {
	@Autowired
	private UserResponitory userResponitory;
	
	public User Add(User user) {
		return userResponitory.save(user);
	}
	
	public List<User> AddAll(List<User> users) {
		return userResponitory.saveAll(users);
	}
	
	public List<User> GetAll(){
		return userResponitory.findAll();
	}
	
	public List<User> CheckUser(User user){
		return userResponitory.CheckUser(user.getUserName(), user.getPassword());
	}
	
	public String Delete(String username) {
		userResponitory.deleteById(username);
		return username;
	}
	
	public User Update(User user) {
		User existing = userResponitory.findById(user.getUserName()).orElse(null);
		existing.setFullName(user.getFullName());
		existing.setDateOfBirth(user.getDateOfBirth());
		existing.setGender(user.getGender());
		existing.setAddress(user.getAddress());
		existing.setPhoneNumber(user.getPhoneNumber());
		existing.setJob(user.getJob());
		existing.setUniversity(user.getUniversity());
		existing.setPassword(user.getPassword());
		return userResponitory.save(existing);
	}
}
