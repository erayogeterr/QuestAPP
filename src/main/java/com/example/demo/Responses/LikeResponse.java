package com.example.demo.Responses;

import com.example.demo.Entity.Like;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LikeResponse {

	private Long id;
	private Long userId;
	private Long postId;
	
	public LikeResponse(Like entity) {
		this.id = entity.getId();
		this.userId = entity.getUser().getId();
		this.postId = entity.getPost().getId();
	}
	
	
}
