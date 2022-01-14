package com.sem.movieap.controller.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MovieCreateResponse {

    private Long id;

    public static MovieCreateResponse convertToMovieCreateResponse(Long id) {
        return MovieCreateResponse.builder()
                .id(id)
                .build();
    }
}
