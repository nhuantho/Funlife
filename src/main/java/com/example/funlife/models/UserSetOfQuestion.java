package com.example.funlife.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usersetofquestion")
public class UserSetOfQuestion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "username", nullable = false)
	private String userName;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "username", foreignKey = @ForeignKey(name = "FK_usersetofquestion_user"), insertable = false, updatable = false)
	private User user;
	
	@Column(name = "codesetofquestions", nullable = false)
	private String codeSetOfQuestions;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codesetofquestions", foreignKey = @ForeignKey(name = "FK_usersetofquestion_setofquestion"), insertable = false, updatable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer"})
	private SetOfQuestions setOfQuestions;
	
	@Column(name = "date", nullable = false)
	private String date;
}
