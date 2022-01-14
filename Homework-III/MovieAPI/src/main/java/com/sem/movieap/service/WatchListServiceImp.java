package com.sem.movieap.service;

import com.sem.movieap.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WatchListServiceImp implements WatchListService{

    private final WatchListDao watchListDao;

    @Override
    public Long create(WatchList watchList) {
        WatchListEntity watchListEntity = watchList.convertToWatchListEntity();
        return watchListDao.save(watchListEntity);
    }

    @Override
    public WatchList retrieve(Long id) {
        WatchListEntity entity = watchListDao.retrieve(id);
        return WatchList.convertFrom(entity);
    }
}
