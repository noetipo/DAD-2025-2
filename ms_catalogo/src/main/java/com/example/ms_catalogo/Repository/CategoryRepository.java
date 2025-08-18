package com.example.ms_catalogo.Repository;

import com.example.ms_catalogo.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
List<Category> findByName(String name);
}
