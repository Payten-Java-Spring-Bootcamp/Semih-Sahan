package com.sem.movieap.service;

public interface WatchListService {

    Long create(WatchList watchList);

    WatchList retrieve(Long id);
}
