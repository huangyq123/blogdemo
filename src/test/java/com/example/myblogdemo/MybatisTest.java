package com.example.myblogdemo;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MybatisTest {

    @Autowired
    private SqlSession sqlSession;

    @Test
    public void MybatisTest(){
        System.out.println(sqlSession!=null);
        System.out.println(sqlSession.getClass());
    }
}
