package com.txy;


/**
 * @Author : taoxy
 * @Date: 2024/9/13 15:33
 * @Description :  主题目标
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

    void sendMessage(String message);
}
