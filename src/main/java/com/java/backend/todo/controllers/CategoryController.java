package com.java.backend.todo.controllers;

import com.java.backend.todo.backend.todo.entity.Category;
import com.java.backend.todo.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    @GetMapping("/id")
    public Category findById() {
        return categoryService.findById(148786L);
    }
}
