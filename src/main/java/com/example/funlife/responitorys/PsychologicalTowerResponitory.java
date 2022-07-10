package com.example.funlife.responitorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.funlife.models.PsychologicalTower;

public interface PsychologicalTowerResponitory extends JpaRepository<PsychologicalTower, String>{
	@Query(value = "SELECT * FROM funlife.psychologicaltower WHERE :pointmin >= pointmin AND :pointmax <= pointmax AND codesetofquestions = :codesetofquestions", nativeQuery = true)
	public List<PsychologicalTower> CheckPsychologicalTower(int pointmin, int pointmax, String codesetofquestions);
}
