package com.blog.app.blog.app.apis.payloads;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommentDto {

    private int id;
    private String content;
}
