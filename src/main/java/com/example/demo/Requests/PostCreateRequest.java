package com.example.demo.Requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostCreateRequest {
	
	private Long id;
	private String text;
	private String title;
	private Long userId;

}
