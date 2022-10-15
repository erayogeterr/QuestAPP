package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Like;
import com.example.demo.Requests.LikeCreateRequest;
import com.example.demo.Responses.LikeResponse;
import com.example.demo.Service.LikeService;

@RestController
@RequestMapping("/likes")
public class LikeController {
	
	private LikeService likeService;

	public LikeController(LikeService likeService) {
		this.likeService = likeService;
	}
	
	@GetMapping
	public List<LikeResponse> getAllLikes(@RequestParam Optional<Long> userId, @RequestParam Optional<Long> postId) {
		return likeService.getAllLikesWithParam(userId, postId);
	}
	
	@GetMapping("/{likeId}")
	public Like getOneLike (@PathVariable Long likeId) {
		return likeService.getOneLikeId(likeId);
	}
	
	@PostMapping
	public Like createOneLike(@RequestBody LikeCreateRequest request) {
		return likeService.createOneLike(request);
	}
	
	@DeleteMapping("/{likeId}")
	public void deleteOneLike(@PathVariable Long likeId) {
		 likeService.deleteOneLikeById(likeId);
	}
	
	

}
