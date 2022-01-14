package com.sem.movieap.controller.response;

import com.sem.movieap.service.Member;
import com.sem.movieap.service.Movie;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class MemberResponse {

    private String firstName;
    private String lastName;

    public static MemberResponse convertFromMember(Member member) {
        return MemberResponse.builder()
                .firstName(member.getFirstName())
                .lastName(member.getLastName())
                .build();
    }
}
