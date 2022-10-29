package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Post;
import com.example.demo.Requests.PostCreateRequest;
import com.example.demo.Requests.PostUpdateRequest;
import com.example.demo.Responses.PostResponse;
import com.example.demo.Service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	private final PostService postService;

	public PostController(PostService postService) {
		this.postService = postService;
	}
	
	@GetMapping
	public List<PostResponse> getAllPosts(@RequestParam Optional<Long> userId) {
		return postService.getAllPosts(userId);
	}
	
	@GetMapping("/{postId}") 
	public PostResponse getOnePost(@PathVariable Long postId) {
		return postService.getOnePostByIdWithLikes(postId);
	}
	
	@PostMapping
	public Post createOnePost(@RequestBody PostCreateRequest newPostRequest) {
		return postService.createOnePost(newPostRequest);
	}
	
	@PutMapping("/{postId}")
	public Post updateOnePost(@PathVariable Long postId , @RequestBody PostUpdateRequest updatePost) {
		return postService.updateOnePostById(postId,updatePost);
	}
	
	@DeleteMapping("/{postId}")
	public void deleteOnePost(@PathVariable Long postId) {
		 postService.deleteOnePostById(postId);
	}
	
	
}
