package com.sem.movieap.controller.request;

import com.sem.movieap.MovieGenre;
import com.sem.movieap.service.Movie;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class MovieRequest {

    @NotBlank
    private String name;

    @NotEmpty
    private MovieGenre genre;

    @NotNull
    private String releaseYear;

    @NotNull
    private String director;

    public Movie convertToMovie() {
        return Movie.builder()
                .name(name)
                .genre(genre)
                .releaseYear(releaseYear)
                .director(director)
                .build();
    }
}
