package com.app.bloging.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bloging.dao.IBlogDao;
import com.app.bloging.dao.ICommentDao;
import com.app.bloging.model.Blog;
import com.app.bloging.model.Comment;
import com.app.bloging.service.ICommentService;

@Service
public class CommentServiceImp implements ICommentService{

	@Autowired
	private ICommentDao commentDao;
	
	@Autowired
	private IBlogDao blogDao;
	
	 @Override
	  public Comment createComment(Comment comment) {
	    return this.commentDao.save(comment);
	  }
	 
	 @Override
	public List<Comment> getAllCommentList(Long blogId) {
		 System.out.print(blogId);
//		 Optional<Comment> blog = this.commentDao.findById(blogId);
//		 List<Long>  ids = new ArrayList<>();
//		 ids.add(blogId);
		return this.commentDao.findAllCommentByBlogId(blogId);
	}
}
