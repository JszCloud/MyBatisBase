package cn.name.mybatis.dao;

import cn.name.mybatis.model.User;

import java.util.List;

/**
 * Created by Nominal on 2018/1/17 0017.
 * 微博：@李明易DY
 */
public interface UserMapper {


    /**
     * 根据 id 查询用户信息
     * @param user 
     * @return 指定 id 的用户信息
     */
    public User findById(User user);
    /**
     * 查询所有的用户信息
     * @return 用户集合
     */
    public List<User> findAll();
    /**
     * 修改用户信息
     * @param user 用户信息
     */
    public Integer update(User user);
    /**
     * 添加用户
     * @param user 需要添加的用户信息
     */
    public Integer save(User user);
    /**
     * 删除指定 id 的用户信息
     * @param user
     */
    public Integer del(User user);

}
