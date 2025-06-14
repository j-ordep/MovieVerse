package br.com.movieverse.mapper;

import br.com.movieverse.controller.request.CategoryRequest;
import br.com.movieverse.controller.response.CategoryResponse;
import br.com.movieverse.entity.Category;
import lombok.experimental.UtilityClass;

// static metodo - Pode ser chamado sem criar objeto, mas não acessa this

@UtilityClass // transforma os metodos em static, sem instancia. Classe é final(não pode ser herdada
public class CategoryMapper {

    public Category toCategory(CategoryRequest categoryRequest) {
        return Category
                .builder()
                .name(categoryRequest.name())
                .build();
    }

    public CategoryResponse toCategoryResponse(Category category) {
        return CategoryResponse
                .builder()
                .name(category.getName())
                .id(category.getId())
                .build();
    }

}
