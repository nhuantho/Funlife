package com.example.funlife.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CheckPsychologicalTower {
	private int pointMin;
	private int pointMax;
	private String codeSetOfQuestions;
}
