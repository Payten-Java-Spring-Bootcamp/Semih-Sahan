package com.sem.movieap.controller;

import com.sem.movieap.controller.request.MemberRequest;
import com.sem.movieap.controller.request.MovieRequest;
import com.sem.movieap.controller.response.MemberCreateResponse;
import com.sem.movieap.controller.response.MemberResponse;
import com.sem.movieap.controller.response.MovieCreateResponse;
import com.sem.movieap.controller.response.MovieResponse;
import com.sem.movieap.service.Member;
import com.sem.movieap.service.MemberService;
import com.sem.movieap.service.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/members")
    @ResponseStatus(HttpStatus.CREATED)
    public MemberCreateResponse create(@RequestBody MemberRequest request) {
        Member member = request.convertToMember();
        Long id = memberService.create(member);
        return MemberCreateResponse.convertToMemberCreateResponse(id);
    }

    @GetMapping("/movies/{id}")
    public MemberResponse retrieve(@PathVariable Long id) {
        Member member = memberService.retrieve(id);
        return MemberResponse.convertFromMember(member);
    }


}
