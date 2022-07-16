package com.example.funlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.UserQuestionAnswer;
import com.example.funlife.services.UserQuestionAnswerService;

@RestController
@CrossOrigin("https://funlifeversion1.netlify.app/")
public class UserQuestionAnswerController {
	@Autowired 
	private UserQuestionAnswerService userQuestionAnswerService;
	
	@PostMapping(path = "/addUserQuestionAnswer")
	public UserQuestionAnswer Add(@RequestBody UserQuestionAnswer userQuestionAnswer) {
		return userQuestionAnswerService.Add(userQuestionAnswer);
	}
	
	@PostMapping(path = "/addUserQuestionAnswers")
	public List<UserQuestionAnswer> Add(@RequestBody List<UserQuestionAnswer> userQuestionAnswers) {
		return userQuestionAnswerService.AddAll(userQuestionAnswers);
	}
}
