package com.app.bloging.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bloging.dao.IBlogDao;
import com.app.bloging.model.Blog;
import com.app.bloging.service.IBlogService;

@Service
public class BlogServiceImpl implements IBlogService{
  
  /** The blog dao. */
  @Autowired
  private IBlogDao blogDao;

  /**
   * Creates the blog.
   *
   * @param blog the blog
   * @return the blog
   */
  @Override
  public Blog createBlog(Blog blog) { 
    Blog blogData = new Blog();
    blogData.setBlogTitle(blog.getBlogTitle());
    blogData.setBlogDescription(blog.getBlogDescription());
    return this.blogDao.save(blogData);
  }


	@Override
	public List<Blog> getAllBlogList() {
		return (List<Blog>) this.blogDao.findAll();
	}
  

}
