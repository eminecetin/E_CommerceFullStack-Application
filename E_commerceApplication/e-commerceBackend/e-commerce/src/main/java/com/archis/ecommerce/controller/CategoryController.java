package com.archis.ecommerce.controller;

import com.archis.ecommerce.model.Category;
import com.archis.ecommerce.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping
    public List<Category> getAll(){
        return categoryService.getAllCategories();
    }

    @GetMapping("/{id}")
    public Category getById(@PathVariable Long id) throws Exception {
        return categoryService.getCategoryById(id);
    }

    @PostMapping("/create")
    public String create(@RequestBody Category category){
        return categoryService.createCategory(category);
    }



}
