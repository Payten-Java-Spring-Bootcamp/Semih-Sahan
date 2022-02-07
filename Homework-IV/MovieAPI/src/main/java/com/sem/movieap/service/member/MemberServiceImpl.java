package com.sem.movieap.service.member;

import com.sem.movieap.repository.member.MemberDao;
import com.sem.movieap.repository.member.MemberEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{

    private final MemberDao memberDao;

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
