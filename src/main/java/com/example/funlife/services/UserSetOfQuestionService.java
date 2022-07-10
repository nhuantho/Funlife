package com.example.funlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.funlife.models.UserSetOfQuestion;
import com.example.funlife.responitorys.UserSetOfQuestionResponitory;

@Service
public class UserSetOfQuestionService {
	@Autowired
	private UserSetOfQuestionResponitory userSetOfQuestionResponitory;
	
	public UserSetOfQuestion Add(UserSetOfQuestion userSetOfQuestion) {
		return userSetOfQuestionResponitory.save(userSetOfQuestion);
	}
	
	public List<UserSetOfQuestion> AddAll(List<UserSetOfQuestion> userSetOfQuestions) {
		return userSetOfQuestionResponitory.saveAll(userSetOfQuestions);
	}
}
