package org.k8go4go.myspring.repository;


import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
    @BeforeEach
    public void setUp() throws Exception {

    }

    @Test
    @DisplayName("jdbc Connection Test")
    public void test() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String user = "k8go4go";
        String pw = "k8go4go";
        String url = "jdbc:mysql://localhost:3306/testdb";

        Connection con = DriverManager.getConnection(url, user, pw);
        Assertions.assertNotNull(con);

    }

    @Test
    @DisplayName("jdbc connectionPoolTest Test")
    public void connectionPoolTest() throws Exception {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/testdb?useUnicode=true&characterEncoding=utf8");
        hikariConfig.setUsername("k8go4go");
        hikariConfig.setPassword("k8go4go");
        hikariConfig.setMaximumPoolSize(5);
        hikariConfig.setConnectionTestQuery("SELECT 1");
        hikariConfig.setPoolName("springHikariCP");
        HikariDataSource dataSource = new HikariDataSource(hikariConfig);

        Assertions.assertNotNull(dataSource);

        dataSource.close();
    }

    @Test
    public void mybatisConnectionTest() {

    }

    @AfterEach
    public void destory() throws Exception {

    }
}
