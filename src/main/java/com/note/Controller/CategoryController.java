package com.note.Controller;

import com.note.Entity.Category;
import com.note.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("")
public class CategoryController {

    @Autowired
    private CategoryService categoryService ;

    @PostMapping("/addCategory")
    Category addCategory(@RequestBody Category category){
        return categoryService.addCategory(category);
    }

    @PutMapping("/editCategory/{id}")
    Category editCategory(@RequestBody Category category,@PathVariable long id){
        return categoryService.editCategory(category, id);
    }

    @DeleteMapping("/deleteCategory/{id}")
    void deleteCategory(@PathVariable long id){
        categoryService.deleteCategory(id);
    }

    @GetMapping("/findCategories")
    List<Category> findCategories() {
        return categoryService.findCategories();
    }

    @GetMapping("findCategory/{id}")
    Category findCategory(@PathVariable long id){
        return categoryService.findCategory(id);
    }


}
