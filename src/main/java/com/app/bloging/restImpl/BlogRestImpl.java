package com.app.bloging.restImpl;

import java.util.List;

import com.app.bloging.model.Blog;
import com.app.bloging.rest.IBlogRest;
import com.app.bloging.service.IBlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

// TODO: Auto-generated Javadoc
/**
 * The Class BlogRestImpl.
 */
@RestController
public class BlogRestImpl implements IBlogRest{
  
  /** The blog service. */
  @Autowired
  private IBlogService blogService;

  /**
   * Creates the blog.
   *
   * @param blog the blog
   * @return the blog
   */
  @Override
  public Blog createBlog(Blog blog) {
    Blog createBlog = this.blogService.createBlog(blog);
    return createBlog;
  }

	@Override
	public List<Blog> getAllBlogList() {
		return this.blogService.getAllBlogList();
	}
  

}
