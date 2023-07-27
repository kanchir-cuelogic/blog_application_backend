package com.app.bloging.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.bloging.model.Blog;
import com.app.bloging.model.Comment;

@Repository
public interface ICommentDao extends JpaRepository<Comment, Long>{
 
	
	//List<Comment> findByblogId(Long blogId);
	
	
//	public List<Comment> findByBlog(Blog blog);
	
	//public List<Comment> findByBlog(Blog blog);
	List<Comment> findAllCommentByBlogId(Long blogId);

}
