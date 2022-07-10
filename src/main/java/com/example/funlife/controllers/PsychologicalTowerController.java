package com.example.funlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.CheckPsychologicalTower;
import com.example.funlife.models.PsychologicalTower;
import com.example.funlife.services.PsychologicalTowerService;

@RestController
public class PsychologicalTowerController {
	@Autowired 
	private PsychologicalTowerService psychologicalTowerService;
	
	@PostMapping(path = "/addPsychologicalTower")
	public PsychologicalTower Add(@RequestBody PsychologicalTower psychologicalTower) {
		return psychologicalTowerService.Add(psychologicalTower);
	}
	
	@PostMapping(path = "/addPsychologicalTowers")
	public List<PsychologicalTower> Add(@RequestBody List<PsychologicalTower> psychologicalTowers) {
		return psychologicalTowerService.AddAll(psychologicalTowers);
	}
	
	@GetMapping(path = "/getAllPsychologicalTowers")
	public List<PsychologicalTower> GetAll(){
		return psychologicalTowerService.GetAll();
	}
	
	@PostMapping(path = "/checkPsychologicalTower")
	public List<PsychologicalTower> CheckUser(@RequestBody CheckPsychologicalTower checkPsychologicalTower){
		return psychologicalTowerService.CheckPsychologicalTower(checkPsychologicalTower);
	}
	
	@DeleteMapping(path = "/deletePsychologicalTower/{code}")
	public String Delete(@PathVariable String code) {
		return psychologicalTowerService.Delete(code);
	}
}
