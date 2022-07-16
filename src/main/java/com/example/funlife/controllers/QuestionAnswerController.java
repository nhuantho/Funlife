package com.example.funlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.QuestionAnswer;
import com.example.funlife.services.QuestionAnswerService;

@RestController
@CrossOrigin("https://funlifeversion1.netlify.app/")
public class QuestionAnswerController {
	@Autowired
	private QuestionAnswerService questionAnswerService;
	
	@PostMapping(path = "/addQuestionAnswer")
	public QuestionAnswer Add(@RequestBody QuestionAnswer questionAnswer) {
		return questionAnswerService.Add(questionAnswer);
	}
	
	@PostMapping(path = "/addQuestionAnswers")
	public List<QuestionAnswer> Add(@RequestBody List<QuestionAnswer> questionAnswers) {
		return questionAnswerService.AddAll(questionAnswers);
	}
	
	@GetMapping(path = "/getAllQuestionAnswers")
	public List<QuestionAnswer> GetAll(){
		return questionAnswerService.GetAll();
	}
	
	@DeleteMapping(path = "/deleteQuestionAnswer/{id}")
	public String Delete(@PathVariable int id) {
		return questionAnswerService.Delete(id);
	}
}
