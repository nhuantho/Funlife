package com.example.funlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.funlife.models.UserPsychologist;
import com.example.funlife.responitorys.UserPsychologistResponitory;

@Service
public class UserPsychologistService {
	@Autowired
	private UserPsychologistResponitory userPsychologistResponitory;
	
	public UserPsychologist Add(UserPsychologist userPsychologist) {
		return userPsychologistResponitory.save(userPsychologist);
	}
	
	public List<UserPsychologist> AddAll(List<UserPsychologist> userPsychologists) {
		return userPsychologistResponitory.saveAll(userPsychologists);
	}
}
