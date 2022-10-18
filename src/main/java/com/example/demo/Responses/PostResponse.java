package com.example.demo.Responses;

import java.util.List;

import com.example.demo.Entity.Post;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostResponse {
	
	private Long id;
	private Long userId;
	private String userName;
	private String title;
	private String text;
	private List<LikeResponse> postLikes;

	public PostResponse (Post entity, List<LikeResponse> likes) { //Mapper
		this.id = entity.getId();
		this.userId = entity.getUser().getId();
		this.userName = entity.getUser().getUserName();
		this.title = entity.getTitle();
		this.text = entity.getText();
		this.postLikes = likes;
	}
}
