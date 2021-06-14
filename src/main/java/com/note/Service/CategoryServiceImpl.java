package com.note.Service;

import com.note.Entity.Category;
import com.note.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Transactional
@Component
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category editCategory(Category category, long id) {
        Category existingCategory = categoryRepository.findById(id).orElse(null);
        existingCategory.setName(category.getName());
        return categoryRepository.save(existingCategory);
    }

    @Override
    public void deleteCategory(long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public Category findCategory(long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<Category> findCategories() {
        List<Category> categories= categoryRepository.findAll();
        categories=categories.stream().sorted(Comparator.comparing(Category::getName).reversed()).collect(Collectors.toList());
        return categories;
    }
}
