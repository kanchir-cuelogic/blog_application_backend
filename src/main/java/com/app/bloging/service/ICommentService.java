package com.app.bloging.service;

import java.util.List;

import com.app.bloging.model.Comment;

public interface ICommentService {

	public Comment createComment(Comment comment);
	
	public List<Comment> getAllCommentList(Long blogId) ;
}
