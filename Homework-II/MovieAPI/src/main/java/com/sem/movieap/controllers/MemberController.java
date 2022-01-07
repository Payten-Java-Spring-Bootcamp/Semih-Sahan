package com.sem.movieap.controllers;

import com.sem.movieap.entities.Member;
import com.sem.movieap.entities.Movie;
import com.sem.movieap.entities.MovieList;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberController {

    List<Member> members=new ArrayList<Member>();

    long memberId=1;

    @PostMapping("/member/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Member add(@RequestBody @Valid Member member){
        member.setId(this.memberId);
        members.add(member);
        memberId++;

        return member;
    }
}
