package com.example.funlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.UserPsychologist;
import com.example.funlife.services.UserPsychologistService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserPsychologistController {
	@Autowired 
	private UserPsychologistService psychologistService;
	
	@PostMapping(path = "/addUserPsychologist")
	public UserPsychologist Add(@RequestBody UserPsychologist user) {
		return psychologistService.Add(user);
	}
	
	@PostMapping(path = "/addUserPsychologists")
	public List<UserPsychologist> Add(@RequestBody List<UserPsychologist> users) {
		return psychologistService.AddAll(users);
	}
}
