package com.example.funlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.funlife.models.SetOfQuestions;
import com.example.funlife.responitorys.SetOfQuestionsResponitory;

@Service
public class SetOfQuestionsService {
	@Autowired
	private SetOfQuestionsResponitory setOfQuestionsResponitory;
	
	public SetOfQuestions Add(SetOfQuestions setOfQuestions) {
		return setOfQuestionsResponitory.save(setOfQuestions);
	}
	
	public List<SetOfQuestions> AddAll(List<SetOfQuestions> setOfQuestions) {
		return setOfQuestionsResponitory.saveAll(setOfQuestions);
	}
	
	public List<SetOfQuestions> GetAll(){
		return setOfQuestionsResponitory.findAll();
	}
	
	public SetOfQuestions GetByCode(String code){
		return setOfQuestionsResponitory.findById(code).orElse(null);
	}
	
	public String Delete(String code) {
		setOfQuestionsResponitory.deleteById(code);
		return code;
	}
	
	public SetOfQuestions Update(SetOfQuestions setOfQuestions) {
		SetOfQuestions existing = setOfQuestionsResponitory.findById(setOfQuestions.getCode()).orElse(null);
		existing.setName(setOfQuestions.getName());
		return setOfQuestionsResponitory.save(existing);
	}
}
