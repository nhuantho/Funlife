package com.example.funlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.funlife.models.Answer;
import com.example.funlife.responitorys.AnswerResponitory;

@Service
public class AnswerService {
	@Autowired
	private AnswerResponitory answerResponitory;
	
	public Answer Add(Answer answer) {
		return answerResponitory.save(answer);
	}
	
	public List<Answer> AddAll(List<Answer> answers) {
		return answerResponitory.saveAll(answers);
	}
	
	public List<Answer> GetAll(){
		return answerResponitory.findAll();
	}
	
	public String Delete(String code) {
		answerResponitory.deleteById(code);
		return code;
	}
	
	public Answer Update(Answer answer) {
		Answer existing = answerResponitory.findById(answer.getCode()).orElse(null);
		existing.setContent(answer.getContent());
		existing.setPoint(answer.getPoint());
		return answerResponitory.save(existing);
	}
}
