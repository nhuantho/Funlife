package com.example.funlife.responitorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.funlife.models.Question;

public interface QuestionResponitory extends JpaRepository<Question, String>{

}
