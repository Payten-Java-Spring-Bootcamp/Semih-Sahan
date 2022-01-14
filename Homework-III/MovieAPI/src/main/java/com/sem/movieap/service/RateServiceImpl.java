package com.sem.movieap.service;

import com.sem.movieap.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RateServiceImpl implements RateService {

    private final RateDao rateDao;
    private final MemberDao memberDao;
    private final MovieDao movieDao;

    @Override
    public Long create(Rate rate) {
        MovieEntity movieEntity = movieDao.retrieve(rate.getMovieId());
        MemberEntity memberEntity = memberDao.retrieve(rate.getMemberId());
        RateEntity rateEntity = rate.convertToRateEntity(memberEntity,movieEntity);
        return rateDao.save(rateEntity);
    }

    @Override
    public List<Rate> retrieve(Long movieId) {
        List<RateEntity> entity = rateDao.retrieve(movieId);
        return Rate.convertFrom(entity);
    }
}
