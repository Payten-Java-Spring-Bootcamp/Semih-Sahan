package com.sem.movieap.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Builder
@ToString
public class WatchList {

    private Long id;

    @NotNull
    private Long memberId;

    @NotBlank
    private String name;

}
