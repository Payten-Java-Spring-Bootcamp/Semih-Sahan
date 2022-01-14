package com.sem.movieap.service;

import com.sem.movieap.repository.MemberEntity;
import com.sem.movieap.repository.MovieEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class Member {

    private Long id;
    private String firstName;
    private String lastName;

    MemberEntity convertToMemberEntity() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setFirstName(getFirstName());
        memberEntity.setLastName(getLastName());
        return memberEntity;
    }

    public static Member convertFrom(MemberEntity entity) {
        return Member.builder()
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .build();
    }
}
