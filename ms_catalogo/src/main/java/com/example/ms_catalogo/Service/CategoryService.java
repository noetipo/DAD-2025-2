package com.example.ms_catalogo.Service;

import com.example.ms_catalogo.Entity.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    List<Category> findAll();
    List<Category> findByName(String name);
    Optional<Category> findById(Integer id);
    Category save(Category category);
    Category update(Category category, Integer id);
    void deleteById(Integer id);
}
