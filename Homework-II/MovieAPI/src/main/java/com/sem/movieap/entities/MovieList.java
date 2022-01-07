package com.sem.movieap.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@ToString
public class MovieList {

    private Long id;

    @NotNull
    private Long movieId;

    @NotNull
    private Long watchListId;
}
