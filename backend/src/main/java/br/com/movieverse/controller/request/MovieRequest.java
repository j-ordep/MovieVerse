package br.com.movieverse.controller.request;

import br.com.movieverse.entity.Category;

import java.time.LocalDate;
import java.util.List;

public record MovieRequest(
        String title,
        String description,
        LocalDate releaseDate,
        double rating,
        List<Long>categories,
        List<Long>streamings
        ) {
}
