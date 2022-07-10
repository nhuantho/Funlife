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
@Table(name = "psychologist")
public class Psychologist {
	@Id
	@Column(name = "code", nullable = false)
	private String code;
	
	@Column(name = "fullname", nullable = false)
	private String fullName;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "phonenumber", nullable = false)
	private String phoneNumber;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "note", nullable = true)
	private String note;
	
	@OneToMany(mappedBy = "psychologist", fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, orphanRemoval = true)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<UserPsychologist> userPsychologists = new ArrayList<>();
}
