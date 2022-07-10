package com.example.funlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.funlife.models.CheckPsychologicalTower;
import com.example.funlife.models.PsychologicalTower;
import com.example.funlife.responitorys.PsychologicalTowerResponitory;

@Service
public class PsychologicalTowerService {
	@Autowired
	private PsychologicalTowerResponitory psychologicalTowerResponitory;
	
	public PsychologicalTower Add(PsychologicalTower psychologicalTower) {
		return psychologicalTowerResponitory.save(psychologicalTower);
	}
	
	public List<PsychologicalTower> AddAll(List<PsychologicalTower> psychologicalTowers) {
		return psychologicalTowerResponitory.saveAll(psychologicalTowers);
	}
	
	public List<PsychologicalTower> GetAll(){
		return psychologicalTowerResponitory.findAll();
	}
	
	public List<PsychologicalTower> CheckPsychologicalTower(CheckPsychologicalTower checkPsychologicalTower){
		return psychologicalTowerResponitory.CheckPsychologicalTower(checkPsychologicalTower.getPointMin(), checkPsychologicalTower.getPointMax(), checkPsychologicalTower.getCodeSetOfQuestions());
	}
	
	public String Delete(String code) {
		psychologicalTowerResponitory.deleteById(code);
		return code;
	}
}
