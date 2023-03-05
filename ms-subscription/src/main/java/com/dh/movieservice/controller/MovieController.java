package com.dh.movieservice.controller;

import com.dh.movieservice.model.Movie;
import com.dh.movieservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/movies/{genre}")
    public ResponseEntity<Optional<List<Movie>>> find(@PathVariable String genre) {
        return ResponseEntity.ok(movieService.find(genre));
    }
    @PostMapping("/movies")
    public ResponseEntity<Movie> find(@RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.guardar(movie));
    }
}
