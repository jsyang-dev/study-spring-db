package me.study.springdb.repository;

import me.study.springdb.domain.Member;

public interface MemberRepositoryEx {

    Member save(Member member);

    Member findById(String memberId);

    void update(String memberId, int money);

    void delete(String memberId);
}
