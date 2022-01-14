package com.sem.movieap.service;

public interface MemberService {

    Long create(Member member);

    Member retrieve(Long id);
}
