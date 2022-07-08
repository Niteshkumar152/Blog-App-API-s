package com.blog.app.blog.app.apis.controller;

import com.blog.app.blog.app.apis.entities.Comment;
import com.blog.app.blog.app.apis.payloads.ApiResponse;
import com.blog.app.blog.app.apis.payloads.CommentDto;
import com.blog.app.blog.app.apis.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto, @PathVariable Integer postId){
        CommentDto createdComment = this.commentService.createComment(commentDto,postId);
        return new ResponseEntity<CommentDto>(createdComment, HttpStatus.OK);
    }

    @DeleteMapping("/comments/{commentId}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentId){
        this.commentService.deleteComment(commentId);
        return new ResponseEntity<ApiResponse>(new ApiResponse("Comment deleted successfully !!",true),HttpStatus.OK);
    }

}
