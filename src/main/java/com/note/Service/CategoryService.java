package com.note.Service;

import com.note.Entity.Category;

import java.util.List;

public interface CategoryService {
    Category addCategory(Category category);
    Category editCategory(Category category, long id);
    void deleteCategory(long id);
    Category findCategory(long id);
    List<Category> findCategorie();
}
