package br.com.movieverse.service;

import br.com.movieverse.entity.Movie;
import br.com.movieverse.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> findAll() {
        List<Movie> movies = movieRepository.findAll();
        return movies;
    }

    public Optional<Movie> getById(Long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        return movie;
    }
}
