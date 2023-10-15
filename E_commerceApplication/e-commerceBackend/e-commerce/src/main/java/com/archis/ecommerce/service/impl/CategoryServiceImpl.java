package com.archis.ecommerce.service.impl;

import com.archis.ecommerce.model.Category;
import com.archis.ecommerce.repository.CategoryRepository;
import com.archis.ecommerce.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(Long id) throws Exception {
        Optional<Category> category=categoryRepository.findById(id);
        if(!category.isPresent()){
            throw new Exception("Bu id ile ilgili herhangi bir category bulunamadı..");
        }
        return category.get();
    }

    @Override
    public String createCategory(Category category) {
        categoryRepository.save(category);
        return "Category Basarili bir şekilde eklendi category id: "+ category.getId();
    }

    @Override
    public String updateCategory(Long id, Category category) {
        return null;
    }

    @Override
    public String delete(Long id) {
        return null;
    }
}
