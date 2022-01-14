package com.sem.movieap.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RateDaoImpl implements RateDao{

    private final RateJpaRepository rateJpaRepository;

    @Override
    public Long save(RateEntity entity) {
        RateEntity savedEntity = rateJpaRepository.save(entity);
        return savedEntity.getId();
    }

    @Override
    public List<RateEntity> retrieve(Long movieId) {
        Optional<List<RateEntity>> rateEntityOptional = rateJpaRepository.retrieve(movieId);

        if (rateEntityOptional.isPresent())
            return rateEntityOptional.get();
        else
            throw new RuntimeException();
    }
}
