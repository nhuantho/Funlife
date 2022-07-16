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

import com.example.funlife.models.SetOfQuestions;
import com.example.funlife.services.SetOfQuestionsService;

@RestController
@CrossOrigin("https://funlifeversion1.netlify.app/")
public class SetOfQuestionsController {
	@Autowired
	private SetOfQuestionsService setOfQuestionsService;
	
	@PostMapping(path = "/addSetOfQuestion")
	public SetOfQuestions Add(@RequestBody SetOfQuestions setOfQuestions) {
		return setOfQuestionsService.Add(setOfQuestions);
	}
	
	@PostMapping(path = "/addSetOfQuestions")
	public List<SetOfQuestions> Add(@RequestBody List<SetOfQuestions> setOfQuestions) {
		return setOfQuestionsService.AddAll(setOfQuestions);
	}
	
	@GetMapping(path = "/getAllSetOfQuestions")
	public List<SetOfQuestions> GetAll(){
		return setOfQuestionsService.GetAll();
	}
	
	@GetMapping(path = "/getByCodeSetOfQuestions/{code}")
	public SetOfQuestions GetByCode(@PathVariable String code){
		return setOfQuestionsService.GetByCode(code);
	}
	
	@PutMapping(path = "/updateSetOfQuestions")
	public SetOfQuestions Update(@RequestBody SetOfQuestions setOfQuestions) {
		return setOfQuestionsService.Update(setOfQuestions);	
	}
	
	@DeleteMapping(path = "/deleteSetOfQuestions/{code}")
	public String Delete(@PathVariable String code) {
		return setOfQuestionsService.Delete(code);
	}
}
