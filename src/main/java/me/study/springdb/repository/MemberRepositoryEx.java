package me.study.springdb.repository;

import me.study.springdb.domain.Member;

import java.sql.SQLException;

public interface MemberRepositoryEx {

    Member save(Member member) throws SQLException;

    Member findById(String memberId) throws SQLException;

    void update(String memberId, int money) throws SQLException;

    void delete(String memberId) throws SQLException;
}
