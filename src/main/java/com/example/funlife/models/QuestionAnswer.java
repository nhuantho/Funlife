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
@Table(name = "questionanswer")
public class QuestionAnswer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = true)
	private int id;
	
	@Column(name = "codequestion", nullable = false)
	private String codeQuestion;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codequestion", foreignKey = @ForeignKey(name = "FK_questionanswer_question"), insertable = false, updatable = false)
	private Question question;
	
	@Column(name = "codeanswer", nullable = false)
	private String codeAnswer;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codeanswer", foreignKey = @ForeignKey(name = "FK_questionanswer_answer"), insertable = false, updatable = false)
	@JsonIgnoreProperties({"hibernateLazyInitializer"})
	private Answer answer;
	
	@Column(name = "checktest", nullable = true)
	private String checkTest;
}
