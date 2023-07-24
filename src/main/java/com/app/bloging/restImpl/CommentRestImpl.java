package com.app.bloging.restImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.app.bloging.model.Blog;
import com.app.bloging.model.Comment;
import com.app.bloging.rest.ICommentRest;
import com.app.bloging.service.ICommentService;

@RestController
public class CommentRestImpl implements ICommentRest{
	
	@Autowired
	private ICommentService commentService;

	@Override
	public String createComment(Comment comment) {
    Comment commentData = this.commentService.createComment(comment);
    return "create comment Successfully";
  }
	
	@Override
	public List<Comment> getAllCommentList(Long blogId) {
		return this.commentService.getAllCommentList(blogId);
	}
}
