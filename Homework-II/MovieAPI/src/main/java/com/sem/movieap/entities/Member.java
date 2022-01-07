package com.sem.movieap.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@ToString
public class Member {

    private Long id;

    @NotBlank
    private String name;


}
