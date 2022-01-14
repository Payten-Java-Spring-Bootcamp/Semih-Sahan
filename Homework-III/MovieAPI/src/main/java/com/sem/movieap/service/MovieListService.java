package com.sem.movieap.service;

public interface MovieListService {
    Long create(MovieList movieList);

    MovieList retrieve(Long id);
}
