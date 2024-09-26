package com.txy;

/**
 * @Author : taoxy
 * @Date: 2024/9/13 15:40
 * @Description :
 */
public class ConcreteObserver implements Observer{

    private String name;

    public ConcreteObserver(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void acceptMessage(String message) {
        System.out.println(this.getName()+"快来 "+message + "  开始吃饭了、、、");
    }
}
