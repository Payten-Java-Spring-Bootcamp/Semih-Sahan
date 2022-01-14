package com.sem.movieap.controller.request;

import com.sem.movieap.service.Rate;
import com.sem.movieap.service.WatchList;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class WatchListRequest {
    @NotBlank
    private String name;

    public WatchList convertToWatchList() {
        return WatchList.builder()
                .name(name)
                .build();
    }
}
