package br.com.movieflix.service;

import br.com.movieflix.entity.Category;
import br.com.movieflix.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
       List<Category> categories = categoryRepository.findAll();
       return categories;
    }

    // flyway configurado
    // spring security no POM.XML comentado para não atrapalhar o desenvolvimento por enquanto

    // TODO fazer melhorias, se existe já no banco a category etc
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }
}
