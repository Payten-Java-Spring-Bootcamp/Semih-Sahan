package com.sem.movieap.controller.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RateCreateResponse {
    private Long id;

    public static RateCreateResponse convertToRateCreateResponse(Long id) {
        return RateCreateResponse.builder()
                .id(id)
                .build();
    }
}
