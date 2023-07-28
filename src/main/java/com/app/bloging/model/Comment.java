package com.app.bloging.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "BLOG_COMMENTS")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="COMMENT_ID")
	private Long commentId;

	@Column(name="BLOG_ID")
	private Long blogId;
	
	@Column(name="COMMENT_DETAIL")
	private String commentDetail;

	/**
	 * @return the blogId
	 */
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

	
	@Override
	public String toString() {
		return "BlogComments [commentId=" + commentId + ", commentDetail=" + commentDetail + ", blogId=" +  blogId + "]";
	}
	
}
