package com.app.bloging.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.app.bloging.model.Blog;

/**
 * The Interface IBlogDao.
 */
@Repository
public interface IBlogDao extends PagingAndSortingRepository<Blog, Long>{
}
