package com.sem.movieap.service;

public interface MovieService {

    Long create(Movie movie);

    Movie retrieve(Long id);
}
