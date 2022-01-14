package com.sem.movieap.service;

import com.sem.movieap.repository.MovieListDao;
import com.sem.movieap.repository.MovieListEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieListServiceImpl implements MovieListService {

    private final MovieListDao movieListDao;

    @Override
    public Long create(MovieList movieList) {
        MovieListEntity movieListEntity=new MovieListEntity();
        return movieListDao.save(movieListEntity);
    }

    @Override
    public MovieList retrieve(Long id) {
        MovieListEntity entity = movieListDao.retrieve(id);
        return MovieList.convertFrom(entity);
    }
}
