package org.k8go4go.myspring.repository;


import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
    private Connection con;

    @BeforeEach
    public void setUp() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }

    @Test
    @DisplayName("jdbc Connection Test")
    public void test() throws Exception {
        String user = "k8go4go";
        String pw = "k8go4go";
        String url = "jdbc:mysql://localhost:3306/testdb";

        con = DriverManager.getConnection(url, user, pw);

        Assertions.assertNotNull(con);

    }

    @AfterEach
    public void destory() throws Exception{
        con.close();
    }
}
