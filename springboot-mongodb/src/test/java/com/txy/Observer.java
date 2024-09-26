package com.txy;

/**
 * @Author : taoxy
 * @Date: 2024/9/13 15:35
 * @Description : 观察者接口
 */
public interface Observer {
    //接受通知
    void acceptMessage(String message);
}

