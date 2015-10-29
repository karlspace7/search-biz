package com.yao.search.biz.core.dao;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:config/core/spring-database.xml",
        "classpath:config/core/mybatis-config.xml"
})
public class DataSourceTest {

    @Autowired
    BasicDataSource searchDataSource;

    @Test
    public void testConnection() throws Exception{
        System.out.println(searchDataSource.getConnection());
        ResultSet rs = searchDataSource.getConnection().createStatement().executeQuery("select now() from dual");
        System.out.println(rs.getMetaData());
    }

    @Test
    public void testJdbcTemplate() throws Exception {
        JdbcTemplate jt = new JdbcTemplate(searchDataSource);
        List li = jt.queryForList("select now() from dual");
        System.out.println(li);
    }

}
