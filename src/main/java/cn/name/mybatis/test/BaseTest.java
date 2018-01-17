package cn.name.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * Created by Nominal on 2018/1/17 0017.
 * 微博：@李明易DY
 */
public class BaseTest {
    // MyBatis 会话工厂
    private static SqlSessionFactory sqlSessionFactory;

    // Reader
    private static Reader reader;

    static {
        try {
            // 读取配置文件
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            // 根据配置信息产生 MyBatis 会话工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 得到 MyBatis 会话工厂
     * @return MyBatis 会话工厂
     */
    public static SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }

}
