package com.example.funlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.Question;
import com.example.funlife.services.QuestionService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class QuestionController {
	@Autowired
	private QuestionService questionService;
	
	@PostMapping(path = "/addQuestion")
	public Question Add(@RequestBody Question question) {
		return questionService.Add(question);
	}
	
	@PostMapping(path = "/addQuestions")
	public List<Question> Add(@RequestBody List<Question> questions) {
		return questionService.AddAll(questions);
	}
	
	@GetMapping(path = "/getAllQuestions")
	public List<Question> GetAll(){
		return questionService.GetAll();
	}
	
	@PutMapping(path = "/updateQuestion")
	public Question Update(@RequestBody Question question) {
		return questionService.Update(question);	
	}
	
	@DeleteMapping(path = "/deleteQuestion/{code}")
	public String Delete(@PathVariable String code) {
		return questionService.Delete(code);
	}
}
