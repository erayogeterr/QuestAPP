package com.example.demo.Responses;

import com.example.demo.Entity.Post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {
	
	Long id;
	Long userId;
	String userName;
	String title;
	String text;

	public PostResponse (Post entity) { //Mapper
		this.id = entity.getId();
		this.userId = entity.getUser().getId();
		this.userName = entity.getUser().getUserName();
		this.title = entity.getTitle();
		this.text = entity.getText();
	}
}
