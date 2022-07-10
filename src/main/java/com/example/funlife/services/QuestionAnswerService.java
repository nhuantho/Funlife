package com.example.funlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.funlife.models.QuestionAnswer;
import com.example.funlife.responitorys.QuestionAnswerResponitory;

@Service
public class QuestionAnswerService {
	@Autowired
	private QuestionAnswerResponitory questionAnswerResponitory;
	
	public QuestionAnswer Add(QuestionAnswer questionAnswer) {
		return questionAnswerResponitory.save(questionAnswer);
	}
	
	public List<QuestionAnswer> AddAll(List<QuestionAnswer> questionAnswers) {
		return questionAnswerResponitory.saveAll(questionAnswers);
	}
	
	public List<QuestionAnswer> GetAll(){
		return questionAnswerResponitory.findAll();
	}
	
	public String Delete(int id) {
		questionAnswerResponitory.deleteById(id);
		return String.valueOf(id);
	}
	
}
