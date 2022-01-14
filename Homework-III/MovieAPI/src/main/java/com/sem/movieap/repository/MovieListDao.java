package com.sem.movieap.repository;

public interface MovieListDao {
    Long save(MovieListEntity entity);

    MovieListEntity retrieve(Long id);

}
