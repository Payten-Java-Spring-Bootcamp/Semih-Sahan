package com.sem.movieap.entities;

import com.sem.movieap.entities.enums.Genre;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class Movie {

    private Long id;

    @NotBlank
    private String name;

    private List<Genre> genre;

    @NotBlank
    private String releaseYear;

    @NotBlank
    private String director;

    @NotEmpty
    private List<String> cast;
}
