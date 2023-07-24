package com.app.bloging.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "BLOG_COMMENTS")
public class Comment {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long commentId;

	private String commentDetail;
	
	private Long blogId;

	@ManyToOne(fetch = FetchType.EAGER)
	private Blog blog;

	/**
	 * @return the blogId
	 */
	@JsonIgnore
	public Long getBlogId() {
		return blogId;
	}

	/**
	 * @param blogId the blogId to set
	 */
	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	/**
	 * @return the commentId
	 */
	public Long getCommentId() {
		return commentId;
	}

	/**
	 * @param commentId the commentId to set
	 */
	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	/**
	 * @return the commentDetail
	 */
	public String getCommentDetail() {
		return commentDetail;
	}

	/**
	 * @param commentDetail the commentDetail to set
	 */
	public void setCommentDetail(String commentDetail) {
		this.commentDetail = commentDetail;
	}

	/**
	 * @return the blog
	 */
	@JsonIgnore
	public Blog getBlog() {
		return blog;
	}

	/**
	 * @param blog the blog to set
	 */
	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	@Override
	public String toString() {
		return "BlogComments [commentId=" + commentId + ", commentDetail=" + commentDetail + ", blog=" + blog + "]";
	}
	
}
