package com.sem.movieap.repository;

public interface MovieDao {

    Long save(MovieEntity entity);

    MovieEntity retrieve(Long id);

}
