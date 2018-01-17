package cn.name.mybatis.test;

import cn.name.mybatis.dao.UserMapper;
import cn.name.mybatis.model.User;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by Nominal on 2018/1/17 0017.
 * 微博：@李明易DY
 */
public class TestDelete {
    /**
     * 添加
     * @param args
     */
    public static void main(String[] args) {
        UserMapper userMapper=null;
        SqlSession sqlSession=null;
        sqlSession=BaseTest.getSqlSessionFactory().openSession();
        userMapper= sqlSession.getMapper(UserMapper.class);//核心代码
        Integer row=userMapper.del(new User(9));
        sqlSession.commit();
        sqlSession.close();
        if (row>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }
}
