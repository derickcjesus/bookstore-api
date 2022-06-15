package com.derick.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.derick.bookstore.domain.Category;

@Repository
public interface BookRepository extends JpaRepository<Category, Integer>{

}
