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

import com.example.funlife.models.Answer;
import com.example.funlife.services.AnswerService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class AnswerController {
	@Autowired
	private AnswerService answerService;
	
	@PostMapping(path = "/addAnswer")
	public Answer Add(@RequestBody Answer answer) {
		return answerService.Add(answer);
	}
	
	@PostMapping(path = "/addAnswers")
	public List<Answer> Add(@RequestBody List<Answer> answers) {
		return answerService.AddAll(answers);
	}
	
	@GetMapping(path = "/getAllAnswers")
	public List<Answer> GetAll(){
		return answerService.GetAll();
	}
	
	@PutMapping(path = "/updateAnswer")
	public Answer Update(@RequestBody Answer answer) {
		return answerService.Update(answer);	
	}
	
	@DeleteMapping(path = "/deleteAnswer/{code}")
	public String Delete(@PathVariable String code) {
		return answerService.Delete(code);
	}
}
