package com.sem.movieap.service;

import java.util.List;

public interface RateService {

    Long create(Rate rate);

    List<Rate> retrieve(Long movieId);
}
