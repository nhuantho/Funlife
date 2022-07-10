package com.example.funlife.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.funlife.models.Posts;
import com.example.funlife.services.PostsService;

@RestController
@CrossOrigin("http://localhost:3000/")
public class PostsController {
	@Autowired
	private PostsService postsService;
	
	@PostMapping(path = "/addPost")
	public Posts Add(@RequestBody Posts posts) {
		return postsService.Add(posts);
	}
	
	@PostMapping(path = "/addPosts")
	public List<Posts> Add(@RequestBody List<Posts> posts) {
		return postsService.AddAll(posts);
	}
	
	@GetMapping(path = "/getAllPosts")
	public List<Posts> GetAll(){
		return postsService.GetAll();
	}
	
	@PutMapping(path = "/updatePosts")
	public Posts Update(@RequestBody Posts posts) {
		return postsService.Update(posts);	
	}
	
	@DeleteMapping(path = "/deletePosts/{id}")
	public String Delete(@PathVariable int id) {
		return postsService.Delete(id);
	}
}
