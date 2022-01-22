package com.sem.movieap.service.matching;

import com.sem.movieap.repository.actor.ActorEntity;
import com.sem.movieap.repository.matching.MatchingEntity;
import com.sem.movieap.repository.movie.MovieEntity;
import com.sem.movieap.repository.movielist.MovieListEntity;
import com.sem.movieap.repository.watchlist.WatchListEntity;
import com.sem.movieap.service.movielist.MovieList;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class Matching {
    private Long id;
    private Long movieId;
    private Long actorId;

    MatchingEntity convertToMatchingEntity(MovieEntity movieEntity, ActorEntity actorEntity) {
        MatchingEntity matchingEntity = new MatchingEntity();
        matchingEntity.setMovieEntity(movieEntity);
        matchingEntity.setActorEntity(actorEntity);
        return matchingEntity;
    }

    public static Matching convertFrom(MatchingEntity entity) {
        return Matching.builder()
                .movieId(entity.getMovieEntity().getId())
                .actorId(entity.getActorEntity().getId())
                .build();
    }
}
