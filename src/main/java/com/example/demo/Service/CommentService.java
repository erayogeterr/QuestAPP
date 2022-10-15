package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Comment;
import com.example.demo.Repository.CommentRepository;

@Service
public class CommentService {

	private CommentRepository commentRepository;
	
	public CommentService(CommentRepository commentRepository) {
		this.commentRepository = commentRepository;
	}

	public List<Comment> getAllComments() {
		return commentRepository.findAll();
	}

	public Comment getOneComment(Long commentId) {
		return commentRepository.findById(commentId).orElse(null);
	}

	public Comment saveOneComment(Comment comment) {
		return commentRepository.save(comment);
	}

	public void deleteById(Long commentId) {
		commentRepository.deleteById(commentId);
	}

	public Comment updateOneComment(Long commentId, Comment comment) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
