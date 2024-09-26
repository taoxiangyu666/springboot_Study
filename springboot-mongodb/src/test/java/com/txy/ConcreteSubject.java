package com.txy;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : taoxy
 * @Date: 2024/9/13 15:37
 * @Description :
 */
public class ConcreteSubject implements Subject {

    private String name;

    public ConcreteSubject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //观察者列表
    private List<Observer> observerList = new ArrayList<>();
    //要发布的消息
    private String message;


    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.acceptMessage(message);
        }
    }

    @Override
    public void sendMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}
