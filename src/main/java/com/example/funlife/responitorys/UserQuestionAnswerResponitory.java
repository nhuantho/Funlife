package com.example.funlife.responitorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.funlife.models.UserQuestionAnswer;

public interface UserQuestionAnswerResponitory extends JpaRepository<UserQuestionAnswer, Integer>{

}
