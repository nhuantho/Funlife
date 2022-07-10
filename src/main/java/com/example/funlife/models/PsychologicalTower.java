package com.example.funlife.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "psychologicaltower")
public class PsychologicalTower {
	@Id
	@Column(name = "code", nullable = false)
	private String code;
	
	@Column(name = "diseaselevel", nullable = false)
	private String diseaseLevel;
	
	@Column(name = "pointmin", nullable = false)
	private int pointMin;
	
	@Column(name = "pointmax", nullable = false)
	private int pointMax;
	
	@Column(name = "advice", nullable = true, length = 2000)
	private String advice;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codesetofquestions", foreignKey = @ForeignKey(name = "FK_psychologicaltowers_setofquestions"))
	private SetOfQuestions setOfQuestions;
	
	@JsonIgnore
	@OneToMany(mappedBy = "psychologicalTower", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<UserPsychologicalTower> userPsychologicalTowers = new ArrayList<>();
}
