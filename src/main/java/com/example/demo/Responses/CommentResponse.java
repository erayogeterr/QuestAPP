package com.example.demo.Responses;

import com.example.demo.Entity.Comment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentResponse {
	
	private Long id;
	private Long userId;
	private String userName;
	private String text;
	
	public CommentResponse(Comment entity) {
		this.id = entity.getId();
		this.userId = entity.getUser().getId();
		this.userName = entity.getUser().getUserName();
		this.text = entity.getText();
	}

}
