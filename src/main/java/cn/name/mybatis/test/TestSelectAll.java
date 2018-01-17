package cn.name.mybatis.test;

import cn.name.mybatis.dao.UserMapper;
import cn.name.mybatis.model.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Nominal on 2018/1/17 0017.
 * 微博：@李明易DY
 */
public class TestSelectAll {
    /**
     * 查询所有
     * @param args
     */
    public static void main(String[] args) {
        UserMapper userMapper=null;
        SqlSession sqlSession=null;
        sqlSession=BaseTest.getSqlSessionFactory().openSession();
        userMapper= sqlSession.getMapper(UserMapper.class);//核心代码
        List<User> list=userMapper.findAll();
        sqlSession.commit();
        sqlSession.close();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
