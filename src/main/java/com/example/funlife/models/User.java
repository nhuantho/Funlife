package com.example.funlife.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
	@Id
	@Column(name = "username", nullable = false)
	private String userName;
	
	@Column(name = "fullname", nullable = false)
	private String fullName;
	
	@Column(name = "dateofbirth", nullable = false)
	private String dateOfBirth;
	
	@Column(name = "gender", nullable = false)
	private String gender;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "phonenumber", nullable = false)
	private String phoneNumber;
	
	@Column(name = "job", nullable = false)
	private String job;
	
	@Column(name = "university", nullable = true)
	private String university;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@Column(name = "isadmin", nullable = false)
	private int isAdmin;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<Posts> posts = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<UserQuestionAnswer> userQuestions = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<UserSetOfQuestion> userSetOfQuestions = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<UserPsychologicalTower> userPsychologicalTowers = new ArrayList<>();
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<UserPsychologist> userPsychologists = new ArrayList<>();
}
