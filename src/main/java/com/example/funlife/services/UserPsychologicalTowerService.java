package com.example.funlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.funlife.models.UserPsychologicalTower;
import com.example.funlife.responitorys.UserPsychologicalTowerResponitory;

@Service
public class UserPsychologicalTowerService {
	@Autowired
	private UserPsychologicalTowerResponitory userPsychologicalTowerResponitory;
	
	public UserPsychologicalTower Add(UserPsychologicalTower userPsychologicalTower) {
		return userPsychologicalTowerResponitory.save(userPsychologicalTower);
	}
	
	public List<UserPsychologicalTower> AddAll(List<UserPsychologicalTower> userPsychologicalTowers) {
		return userPsychologicalTowerResponitory.saveAll(userPsychologicalTowers);
	}
}
