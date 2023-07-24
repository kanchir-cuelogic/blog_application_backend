package com.app.bloging.rest;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.bloging.model.Comment;

/**
 * The Interface IBlogRest.
 */
@RequestMapping("/Comment")
@Validated
public interface ICommentRest {
  
	@PostMapping("/createComment")
	public String createComment(@RequestBody Comment comment);
	
	 @GetMapping("/getAllCommentList/{blogId}")
	 public List<Comment> getAllCommentList(@PathVariable("blogId") Long blogId);
}
