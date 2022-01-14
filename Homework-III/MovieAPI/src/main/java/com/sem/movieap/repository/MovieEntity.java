package com.sem.movieap.repository;

import com.sem.movieap.MovieGenre;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "movie")
@Table(name = "movie")
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private MovieGenre genre;

    private String releaseYear;

    @Column(nullable = false)
    private String director;

    @OneToMany(mappedBy = "rate", fetch = FetchType.EAGER)
    private List<RateEntity> rates;

    @OneToMany(mappedBy = "movielist", fetch = FetchType.EAGER)
    private List<MovieListEntity> movieLists;
}
