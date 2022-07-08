package com.blog.app.blog.app.apis.services;

import java.util.List;
import com.blog.app.blog.app.apis.entities.Post;
import com.blog.app.blog.app.apis.payloads.PostDto;
import com.blog.app.blog.app.apis.payloads.PostResponse;

public interface PostService {

    //create a new post
    PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

    //update a existing post
    PostDto updatePost(PostDto postDto,Integer postId);

    //delete a existing post
    void deletePost(Integer postId);

    //get all posts
    PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy,String sortDirection);

    //get single post
    PostDto getPostById(Integer postId);

    //get all post by Category
    List<PostDto> getPostsByCategory(Integer categoryId);

    //get all posts by user
    List<PostDto> getPostsByUser(Integer userId);

    //search posts
    List<PostDto> searchPosts(String keyword);
}
