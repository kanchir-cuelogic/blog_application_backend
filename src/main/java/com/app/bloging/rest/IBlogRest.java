package com.app.bloging.rest;


import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.bloging.model.Blog;

/**
 * The Interface IBlogRest.
 */
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/Blog")
@Validated
public interface IBlogRest {
  
  /**
   * Creates the Blog.
   *
   * @param Blog the Blog
   * @return the Blog
   */
  @PostMapping("/createBlog")
  public Blog createBlog(@Valid @RequestBody Blog blog);
  
  /**
   * Gets the Blog details
   *
   * @return the Blog List
   */
  @GetMapping("/getAllBlogList")
  public List<Blog> getAllBlogList();

}
