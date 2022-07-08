package com.blog.app.blog.app.apis.repository;

import java.util.List;

import com.blog.app.blog.app.apis.entities.Category;
import com.blog.app.blog.app.apis.entities.Post;
import com.blog.app.blog.app.apis.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post,Integer> {

    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);

    List<Post> findByTitleContaining(String title);
}
