package com.app.bloging.restImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.app.bloging.dao.CustomHttpResponse;
import com.app.bloging.model.Comment;
import com.app.bloging.rest.ICommentRest;
import com.app.bloging.service.ICommentService;
import com.google.gson.Gson;

@RestController
public class CommentRestImpl implements ICommentRest{
	
	@Autowired
	private ICommentService commentService;

	@Override
	public ResponseEntity<Object> createComment(Comment comment) {
	CustomHttpResponse customHttpResponse = new CustomHttpResponse();
    Comment commentData = this.commentService.createComment(comment);
    if(commentData != null) {
    	customHttpResponse.setMessage("create comment Successfully");
    	customHttpResponse.setStatus(HttpStatus.OK.value());
    }
    else {
    	customHttpResponse.setMessage("comment not created");
    	customHttpResponse.setStatus(HttpStatus.BAD_REQUEST.value());
    }
    return new ResponseEntity<Object>(new Gson().toJson(customHttpResponse), 
            HttpStatus.OK);
  }
	
	@Override
	public List<Comment> getAllCommentList(Long blogId) {
		return this.commentService.getAllCommentList(blogId);
	}
}
