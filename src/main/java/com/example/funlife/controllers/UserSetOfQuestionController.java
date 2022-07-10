package com.example.funlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.UserSetOfQuestion;
import com.example.funlife.services.UserSetOfQuestionService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class UserSetOfQuestionController {
	@Autowired 
	private UserSetOfQuestionService userSetOfQuestionService;
	
	@PostMapping(path = "/addUserSetOfQuestion")
	public UserSetOfQuestion Add(@RequestBody UserSetOfQuestion userSetOfQuestion) {
		return userSetOfQuestionService.Add(userSetOfQuestion);
	}
	
	@PostMapping(path = "/addUserSetOfQuestions")
	public List<UserSetOfQuestion> Add(@RequestBody List<UserSetOfQuestion> userSetOfQuestions) {
		return userSetOfQuestionService.AddAll(userSetOfQuestions);
	}
}
