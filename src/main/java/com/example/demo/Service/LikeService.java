package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.LikeRepository;

@Service
public class LikeService {
	
	private LikeRepository likeRepository;

	public LikeService(LikeRepository likeRepository) {
		this.likeRepository = likeRepository;
	}
	
	

}
