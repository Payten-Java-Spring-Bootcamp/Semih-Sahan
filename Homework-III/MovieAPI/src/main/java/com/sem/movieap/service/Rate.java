package com.sem.movieap.service;

import com.sem.movieap.repository.MemberEntity;
import com.sem.movieap.repository.MovieEntity;
import com.sem.movieap.repository.RateEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Builder
@EqualsAndHashCode
public class Rate {

    private LocalDateTime createdDate;
    private Long memberId;
    private Long movieId;
    private Integer point;

    public RateEntity convertToRateEntity(MemberEntity memberEntity,MovieEntity movieEntity) {
        RateEntity entity = new RateEntity();
        entity.setCreatedDate(LocalDateTime.now());
        entity.setMember(memberEntity);
        entity.setMovie(movieEntity);
        entity.setPoint(point);
        return entity;
    }

    public static List<Rate> convertFrom(List<RateEntity> entity) {
        return entity.stream().map(rate->Rate.builder()
                .createdDate(rate.getCreatedDate())
                .memberId(rate.getMember().getId())
                .movieId(rate.getMovie().getId())
                .point(rate.getPoint())
                .build()).collect(Collectors.toList());
    }
}
