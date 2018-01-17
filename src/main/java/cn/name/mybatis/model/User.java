package cn.name.mybatis.model;

import org.apache.ibatis.type.Alias;

/**
 * Created by Nominal on 2018/1/17 0017.
 * 微博：@李明易DY
 */
@Alias("t_user")
public class User {
    private Integer id;
    private String userName;
    private Integer age;
    private String address;

    public User(String userName, Integer age, String address) {
        this.userName = userName;
        this.age = age;
        this.address = address;
    }

    public User(Integer id, String userName, Integer age, String address) {
        this.id = id;
        this.userName = userName;
        this.age = age;
        this.address = address;
    }

    public User(Integer id) {
        this.id = id;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
