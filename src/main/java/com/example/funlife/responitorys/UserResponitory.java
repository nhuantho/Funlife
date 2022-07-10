package com.example.funlife.responitorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.funlife.models.User;

public interface UserResponitory extends JpaRepository<User, String>{
	@Query(value = "SELECT * FROM funlife.user WHERE username = :username AND password = :password", nativeQuery = true)
	public List<User> CheckUser(String username, String password);
}
