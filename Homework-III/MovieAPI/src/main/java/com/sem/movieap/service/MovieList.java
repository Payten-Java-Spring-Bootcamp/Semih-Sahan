package com.sem.movieap.service;

import com.sem.movieap.repository.MovieEntity;
import com.sem.movieap.repository.MovieListEntity;
import com.sem.movieap.repository.WatchListEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Builder
@EqualsAndHashCode
public class MovieList {
    private Long watchListId;
    private Long movieId;

    MovieListEntity convertToMovieListEntity(WatchListEntity watchListEntity,MovieEntity movieEntity) {
        MovieListEntity movieListEntity = new MovieListEntity();
        movieListEntity.setMovie(movieEntity);
        movieListEntity.setWatchList(watchListEntity);
        return movieListEntity;
    }

    public static MovieList convertFrom(MovieListEntity entity) {
        return MovieList.builder()
                .movieId(entity.getMovie().getId())
                .watchListId(entity.getWatchList().getId())
                .build();
    }

}
