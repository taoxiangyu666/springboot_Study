package com.txy.springdataredis.domain;

/**
 * @Author : taoxy
 * @Date: 2024/9/26 11:54
 * @Description :
 */
public class UserCacheObject {
    private Integer id;
    private String name;
    private Integer gender;

    public Integer getId() {
        return id;
    }

    public UserCacheObject setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserCacheObject setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getGender() {
        return gender;
    }

    public UserCacheObject setGender(Integer gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public String toString() {
        return "UserCacheObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

}
