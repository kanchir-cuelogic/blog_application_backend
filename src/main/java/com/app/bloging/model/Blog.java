package com.app.bloging.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

/**
 * The Class Blog.
 */
@Entity
@Table(name= "BLOG")
public class Blog {

  /** The Blog id. */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long blogId;
  
  /** The blogTitle. */
  @NotEmpty(message = "Blog Title Name should not null or empty")
  private String blogTitle;
  
  /** The blogDescription. */
  @NotEmpty(message = "Blog Description should not null or empty")
  private String blogDescription;
  
	public Long getBlogId() {
		return blogId;
	}
	
	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}
	
	public String getBlogTitle() {
		return blogTitle;
	}
	
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	
	public String getBlogDescription() {
		return blogDescription;
	}
	
	public void setBlogDescription(String blogDescription) {
		this.blogDescription = blogDescription;
	}

  	@Override
	public String toString() {
		return "Blog [blogId=" + blogId + ", blogTitle=" + blogTitle + ", blogDescription=" + blogDescription + "]";
	}
  
}


