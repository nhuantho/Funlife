package com.example.funlife.responitorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.funlife.models.Posts;

public interface PostsResponitory extends JpaRepository<Posts, Integer>{

}
