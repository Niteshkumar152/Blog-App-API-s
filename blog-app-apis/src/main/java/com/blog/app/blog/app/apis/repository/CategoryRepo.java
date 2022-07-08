package com.blog.app.blog.app.apis.repository;

import com.blog.app.blog.app.apis.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
