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
public class Point {

    private Long id;

    @NotNull
    private Long memberId;

    @NotNull
    private Long movieId;

    @NotNull
    private Double point;

}
