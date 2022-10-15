package com.example.demo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Comment;
import com.example.demo.Service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	private CommentService commentService;
	
	public CommentController(CommentService commentService) {
		this.commentService = commentService;
	}
	
	@GetMapping
	public List<Comment> getAllComments() {
		return commentService.getAllComments();
	}
	
	@GetMapping("{/commentId}")
	public Comment getOneComment(@PathVariable Long commentId) {
		return commentService.getOneComment(commentId);
	}
	
	@PostMapping
	public Comment saveOneComment(@RequestBody Comment comment) {
		return commentService.saveOneComment(comment);
	}
	
	@DeleteMapping("{/commentId}")
	public void deleteOneComment(@PathVariable Long commentId) {
		commentService.deleteById(commentId);
	}
	
	@PutMapping("{/commentId}")
	public Comment updateComment(@PathVariable Long commentId, @RequestBody Comment comment) {
		return commentService.updateOneComment(commentId, comment);
	}
	

}
