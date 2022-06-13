package me.study.springdb.repository;

import lombok.extern.slf4j.Slf4j;
import me.study.springdb.domain.Member;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.NoSuchElementException;

import static org.assertj.core.api.AssertionsForClassTypes.*;

@Slf4j
class MemberRepositoryV0Test {

    MemberRepositoryV0 repository = new MemberRepositoryV0();

    @Test
    void crud() throws SQLException {
        // save
        final Member member = new Member("memberV0", 10000);
        repository.save(member);

        // findById
        final Member findMember = repository.findById(member.getMemberId());
        log.info("findMember = {}", findMember);
        assertThat(findMember).isEqualTo(member);

        // update
        repository.update(member.getMemberId(), 20000);
        final Member updatedMember = repository.findById(member.getMemberId());
        assertThat(updatedMember.getMoney()).isEqualTo(20000);

        // delete
        repository.delete(member.getMemberId());
        assertThatThrownBy(() -> repository.findById(member.getMemberId()))
                .isInstanceOf(NoSuchElementException.class);
    }
}
