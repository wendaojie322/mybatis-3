package com.lj.learning;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Jie.LJ.Liu
 * @date 2021/2/23 16:43
 */
public class LearningMybatis {
    public static void main(String[] args) throws IOException {
        String resource = "org/mybatis/example/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();

        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = blogMapper.selectBlog(1);

        System.out.println(blog);
    }
}
