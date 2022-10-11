package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "p_like")
@NoArgsConstructor
@AllArgsConstructor
public class Like {
	
	@Id
	Long id;
	Long postId;
	Long userId;

}
