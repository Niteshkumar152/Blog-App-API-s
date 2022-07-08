package com.blog.app.blog.app.apis.repository;

import com.blog.app.blog.app.apis.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Integer> {
}
