package com.sem.movieap.service;

import com.sem.movieap.repository.MovieDao;
import com.sem.movieap.repository.MovieEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService{

    private final MovieDao movieDao;
    //private final RedisTemplate<Long, Movie> movieRedisTemplate;

    @Override
    public Long create(Movie movie) {
        MovieEntity movieEntity = movie.convertToMovieEntity();
        return movieDao.save(movieEntity);
    }

    @Override
    public Movie retrieve(Long id) {
        MovieEntity entity = movieDao.retrieve(id);
        return Movie.convertFrom(entity);
    }
}
