package br.com.movieverse.service;

import br.com.movieverse.entity.Category;
import br.com.movieverse.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories() {
       List<Category> categories = categoryRepository.findAll();
       return categories;
    }

    public Optional<Category> getCategoryById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category;
    }

    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }

}
