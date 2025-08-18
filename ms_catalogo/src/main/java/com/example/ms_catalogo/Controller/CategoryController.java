package com.example.ms_catalogo.Controller;

import com.example.ms_catalogo.Entity.Category;
import com.example.ms_catalogo.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        return ResponseEntity.ok().body(categoryService.findAll());
    }
    @GetMapping("/{id}")
        public ResponseEntity<Optional<Category>> findById(@PathVariable Integer id) {
        return   ResponseEntity.ok().body(categoryService.findById(id));
        }
        @PostMapping
        public ResponseEntity<Category> save(@RequestBody Category category) {
        return ResponseEntity.ok().body(categoryService.save(category));
        }
        @PutMapping("/{id}")
        public ResponseEntity<Category> update(@RequestBody Category category, @PathVariable Integer id) {

        return ResponseEntity.ok().body(categoryService.update(category,id));
        }
        @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) {
        categoryService.deleteById(id);
        return ResponseEntity.ok().body("Eliminacion Correctamente");
        }

}
