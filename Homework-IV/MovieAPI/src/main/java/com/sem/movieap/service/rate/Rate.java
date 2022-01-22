package com.sem.movieap.service.rate;

import com.sem.movieap.repository.member.MemberEntity;
import com.sem.movieap.repository.movie.MovieEntity;
import com.sem.movieap.repository.rate.RateEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDateTime;

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
        entity.setMemberEntity(memberEntity);
        entity.setMovieEntity(movieEntity);
        entity.setPoint(point);
        return entity;
    }

    public static Rate convertFrom(RateEntity entity) {
        return Rate.builder()
                .createdDate(entity.getCreatedDate())
                .memberId(entity.getMemberEntity().getId())
                .movieId(entity.getMovieEntity().getId())
                .point(entity.getPoint())
                .build();
    }
}
