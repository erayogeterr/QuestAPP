package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Entity.Comment;
//import com.example.demo.Entity.Post;

public interface CommentRepository extends JpaRepository<Comment, Long> {

	//List<Post> findByCommentId(Long commentId);
	
	List<Comment> findByUserIdAndPostId(Long userId, Long postId);

	List<Comment> findByUserId(Long userId);

	List<Comment> findByPostId(Long postId);
	
}
