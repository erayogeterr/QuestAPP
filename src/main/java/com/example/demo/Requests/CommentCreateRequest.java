package com.example.demo.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentCreateRequest {

	private Long id;
	private Long userId;
	private Long postId;
	private String text;
}
