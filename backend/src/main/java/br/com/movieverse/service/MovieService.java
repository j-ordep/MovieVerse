package br.com.movieverse.service;

import br.com.movieverse.entity.Movie;
import br.com.movieverse.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAll() {
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }

}
