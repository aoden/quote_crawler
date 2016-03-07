package com.tdt.crawler.dao;

import com.tdt.crawler.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorDAO extends JpaRepository<Author, Integer> {
}
