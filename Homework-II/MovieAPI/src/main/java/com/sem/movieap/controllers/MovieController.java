package com.sem.movieap.controllers;

import com.sem.movieap.entities.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieController {

    List<Movie> movies=new ArrayList<Movie>();
    List<Point> points=new ArrayList<Point>();
    List<WatchList> watchLists=new ArrayList<WatchList>();
    List<MovieList> movieLists=new ArrayList<MovieList>();

    long movieId=1;
    long pointId=1;
    long watchListId=1;
    long movieListId=1;

    @PostMapping("movie/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie add(@RequestBody @Valid Movie movie){
        movie.setId(this.movieId);
        movies.add(movie);
        movieId++;

        return movie;
    }

    @PutMapping("movie/update/{movieId}")
    @ResponseStatus(HttpStatus.OK)
    public Movie update(@PathVariable Integer movieId, @RequestBody Movie movie){

        movies.set(movieId-1,movie);

        return movie;
    }

    @DeleteMapping("movie/delete/{movieId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer movieId) {

        movies.remove(movieId-1);
    }

    @GetMapping("movie/getall")
    @ResponseStatus(HttpStatus.OK)
    public List<Movie> getAll(){

        return movies;
    }

    @PostMapping("movie/rateit/{movieId}/{memberId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void rateIt(@PathVariable Long movieId,@PathVariable Long memberId,@RequestParam(value = "point") Double point){

        points.add(Point.builder()
                .id(pointId)
                .memberId(memberId)
                .movieId(movieId)
                .point(point).build());

        pointId++;
    }

    @GetMapping("point/getall")
    @ResponseStatus(HttpStatus.OK)
    public List<Point> getPoints(){

        return points;
    }

    @PostMapping("movie/watchlist/add/{memberId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void addWatchList(@PathVariable Long memberId,@RequestParam(value = "name") String name){
        watchLists.add(WatchList.builder()
                .id(watchListId)
                .name(name)
                .memberId(memberId)
                .build());

        watchListId++;
    }

    @GetMapping("watchlist/getall")
    @ResponseStatus(HttpStatus.OK)
    public List<WatchList> getWatchLists(){

        return watchLists;
    }

    @PostMapping("movie/movieList/add/{movieId}/{watchListId}")
    @ResponseStatus(HttpStatus.CREATED)
    public void addMovieList(@PathVariable Long movieId,@PathVariable Long watchListId){
        movieLists.add(MovieList.builder()
                .id(movieListId)
                .watchListId(watchListId)
                .movieId(movieId)
                .build());

        movieListId++;
    }

    @GetMapping("movielist/getall")
    @ResponseStatus(HttpStatus.OK)
    public List<MovieList> getMovieLists(){

        return movieLists;
    }
}
