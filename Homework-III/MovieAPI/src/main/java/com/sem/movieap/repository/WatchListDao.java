package com.sem.movieap.repository;

public interface WatchListDao {

    Long save(WatchListEntity entity);

    WatchListEntity retrieve(Long id);
}
