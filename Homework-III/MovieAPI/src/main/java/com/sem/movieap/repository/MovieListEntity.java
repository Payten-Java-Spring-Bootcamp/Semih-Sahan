package com.sem.movieap.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "movielist")
@Table(name = "movielist")
public class MovieListEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(nullable = false)
    private WatchListEntity watchList;

    @ManyToOne
    @JoinColumn(nullable = false)
    private MovieEntity movie;
}
