package br.com.movieverse.controller;

import br.com.movieverse.controller.request.MovieRequest;
import br.com.movieverse.controller.response.MovieResponse;
import br.com.movieverse.entity.Movie;
import br.com.movieverse.mapper.MovieMapper;
import br.com.movieverse.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movieflix/movie")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<MovieResponse> Save(@RequestBody MovieRequest request) {
        Movie movieSaved = movieService.save(MovieMapper.toMovie(request));
        return ResponseEntity.ok(MovieMapper.toMovieResponse(movieSaved));
    }

    @GetMapping
    public ResponseEntity<List<MovieResponse>> findAll() {
        List<Movie> movie = movieService.findAll();
        return ResponseEntity.ok(movie.stream()
                .map(m -> MovieMapper.toMovieResponse(m))
                .toList());
    }
}
