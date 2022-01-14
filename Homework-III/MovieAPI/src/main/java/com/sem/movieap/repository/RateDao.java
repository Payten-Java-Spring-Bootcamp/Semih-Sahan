package com.sem.movieap.repository;


import java.util.List;

public interface RateDao {

    Long save(RateEntity entity);

    List<RateEntity> retrieve(Long id);
}
