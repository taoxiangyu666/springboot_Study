package com.txy.domain;

/**
 * @Author : taoxy
 * @Date: 2024/9/19 9:20
 * @Description :
 */
public class UsersDTO {
    /**
     * 用户编号
     */
    private Integer id;
    /**
     * 账号
     */
    private String username;

    public Integer getId() {
        return id;
    }

    public UsersDTO setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UsersDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public String toString() {
        return "UserDO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
