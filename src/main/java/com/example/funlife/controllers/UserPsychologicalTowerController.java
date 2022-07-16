package com.example.funlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.UserPsychologicalTower;
import com.example.funlife.services.UserPsychologicalTowerService;

@RestController
@CrossOrigin("https://funlifeversion1.netlify.app/")
public class UserPsychologicalTowerController {
	@Autowired 
	private UserPsychologicalTowerService userPsychologicalTowerService;
	
	@PostMapping(path = "/addUserPsychologicalTower")
	public UserPsychologicalTower Add(@RequestBody UserPsychologicalTower userPsychologicalTower) {
		return userPsychologicalTowerService.Add(userPsychologicalTower);
	}
	
	@PostMapping(path = "/addUserPsychologicalTowers")
	public List<UserPsychologicalTower> Add(@RequestBody List<UserPsychologicalTower> userPsychologicalTowers) {
		return userPsychologicalTowerService.AddAll(userPsychologicalTowers);
	}
}
