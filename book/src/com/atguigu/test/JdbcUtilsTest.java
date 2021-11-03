package com.atguigu.test;

import com.atguigu.utils.JdbcUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

/**
 * @author zkd
 * @version 1.0
 */
public class JdbcUtilsTest {
    @Test
    public void testJdbcUtils(){
        for (int i = 0; i < 100;i++) {
            Connection connection = JdbcUtils.getConnection();
            System.out.println(connection);
            JdbcUtils.close(connection);
        }
    }
}
