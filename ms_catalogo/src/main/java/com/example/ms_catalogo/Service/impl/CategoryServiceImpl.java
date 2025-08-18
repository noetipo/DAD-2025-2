package com.example.ms_catalogo.Service.impl;

import com.example.ms_catalogo.Entity.Category;
import com.example.ms_catalogo.Repository.CategoryRepository;
import com.example.ms_catalogo.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> findByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public Optional<Category> findById(Integer id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category update(Category category, Integer id) {
        category.setId(id);
        return categoryRepository.save(category);
    }

    @Override
    public void deleteById(Integer id) {
    categoryRepository.deleteById(id);
    }
}
