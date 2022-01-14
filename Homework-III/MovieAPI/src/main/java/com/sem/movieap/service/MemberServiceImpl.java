package com.sem.movieap.service;

import com.sem.movieap.repository.MemberDao;
import com.sem.movieap.repository.MemberEntity;
import com.sem.movieap.repository.MovieEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private MemberDao memberDao;

    @Override
    public Long create(Member member) {
        MemberEntity memberEntity = member.convertToMemberEntity();
        return memberDao.save(memberEntity);
    }

    @Override
    public Member retrieve(Long id) {
        MemberEntity entity = memberDao.retrieve(id);
        return Member.convertFrom(entity);
    }
}
