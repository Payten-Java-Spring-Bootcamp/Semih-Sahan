package com.sem.movieap.controller.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Builder
public class MemberCreateResponse {

    private Long id;

    public MemberCreateResponse() {
    }

    public MemberCreateResponse(Long id) {
        this.id = id;
    }

    public static MemberCreateResponse convertToMemberCreateResponse(Long id) {
        return MemberCreateResponse.builder()
                .id(id)
                .build();
    }
}
