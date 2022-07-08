package com.blog.app.blog.app.apis.services;

import com.blog.app.blog.app.apis.payloads.CategoryDto;

import java.util.List;

public interface CategoryService {

    //create
    // Interface by default public
    CategoryDto createCategory(CategoryDto categoryDto);

    //update
    CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);

    //delete
    void deleteCategory(Integer categoryId);

    //get
    CategoryDto getCategory(Integer categoryId);

    //get All
    List<CategoryDto> getCategories();

}
