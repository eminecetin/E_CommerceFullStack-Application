package com.archis.ecommerce.service;

import com.archis.ecommerce.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Long id) throws Exception;
    String createCategory(Category category);
    String updateCategory(Long id, Category category);
    String delete(Long id);

}
