package com.example.funlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.funlife.models.Question;
import com.example.funlife.responitorys.QuestionResponitory;

@Service
public class QuestionService {
	@Autowired
	private QuestionResponitory questionResponitory;
	
	public Question Add(Question question) {
		return questionResponitory.save(question);
	}
	
	public List<Question> AddAll(List<Question> questions) {
		return questionResponitory.saveAll(questions);
	}
	
	public List<Question> GetAll(){
		return questionResponitory.findAll();
	}
	
	public String Delete(String code) {
		questionResponitory.deleteById(code);
		return code;
	}
	
	public Question Update(Question question) {
		Question existing = questionResponitory.findById(question.getCode()).orElse(null);
		existing.setContent(question.getContent());
		return questionResponitory.save(existing);
	}
}
