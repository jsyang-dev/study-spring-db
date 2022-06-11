package me.study.springdb.connection;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.assertj.core.api.Assertions.*;

class DBConnectionUtilTest {

    @Test
    void connection() {
        final Connection connection = DBConnectionUtil.getConnection();
        assertThat(connection).isNotNull();
    }
}
