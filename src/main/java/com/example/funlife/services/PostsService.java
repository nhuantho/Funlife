package com.example.funlife.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.funlife.models.Posts;
import com.example.funlife.responitorys.PostsResponitory;

@Service
public class PostsService {
	@Autowired
	private PostsResponitory postsResponitory;
	
	public Posts Add(Posts posts) {
		return postsResponitory.save(posts);
	}
	
	public List<Posts> AddAll(List<Posts> posts) {
		return postsResponitory.saveAll(posts);
	}
	
	public List<Posts> GetAll(){
		return postsResponitory.findAll();
	}
	
	public String Delete(int id) {
		postsResponitory.deleteById(id);
		return String.valueOf(id);
	}
	
	public Posts Update(Posts posts) {
		Posts existing = postsResponitory.findById(posts.getId()).orElse(null);
		existing.setContent(posts.getContent());
		existing.setImage(posts.getImage());
		return postsResponitory.save(existing);
	}
}
