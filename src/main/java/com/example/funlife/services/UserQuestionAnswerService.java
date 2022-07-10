package com.example.funlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.funlife.models.UserQuestionAnswer;
import com.example.funlife.responitorys.UserQuestionAnswerResponitory;

@Service
public class UserQuestionAnswerService {
	@Autowired
	private UserQuestionAnswerResponitory userQuestionAnswerResponitory;
	
	public UserQuestionAnswer Add(UserQuestionAnswer userQuestionAnswer) {
		return userQuestionAnswerResponitory.save(userQuestionAnswer);
	}
	
	public List<UserQuestionAnswer> AddAll(List<UserQuestionAnswer> userQuestionAnswers) {
		return userQuestionAnswerResponitory.saveAll(userQuestionAnswers);
	}
}
