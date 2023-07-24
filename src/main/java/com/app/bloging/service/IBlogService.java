package com.app.bloging.service;

import java.util.List;

import com.app.bloging.model.Blog;

/**
 * The Interface IBlogService.
 */
public interface IBlogService {

  /**
   * Creates the blog.
   *
   * @return the blog
   */
  public Blog createBlog(Blog blog);
  
  
  public List<Blog> getAllBlogList();
}
