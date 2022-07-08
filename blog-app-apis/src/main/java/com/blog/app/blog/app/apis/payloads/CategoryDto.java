package com.blog.app.blog.app.apis.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer categoryId;
    @NotBlank
    @Size(min = 4,message = "Min Size of category title is 4")
    private String categoryTitle;

    @NotBlank
    @Size(max = 10,message = "Min Size of category desc is 10")
    private String categoryDescription;

}
