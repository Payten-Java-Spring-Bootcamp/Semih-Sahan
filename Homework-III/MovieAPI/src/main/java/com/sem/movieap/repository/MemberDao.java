package com.sem.movieap.repository;

public interface MemberDao {

    Long save(MemberEntity entity);

    MemberEntity retrieve(Long id);
}
