package com.blog.app.blog.app.apis.repository;

import com.blog.app.blog.app.apis.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment,Integer> {
}
