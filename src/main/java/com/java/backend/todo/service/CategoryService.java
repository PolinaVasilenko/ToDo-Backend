package com.java.backend.todo.service;


import com.java.backend.todo.backend.todo.entity.Category;
import com.java.backend.todo.repo.CategoryRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service

@Transactional
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository){
        this.repository = repository;
    }

    public Category findById(Long id){
        return repository.findById(id).get();
    }


}
