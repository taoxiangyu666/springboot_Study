package com.txy;

/**
 * @Author : taoxy
 * @Date: 2024/9/13 15:47
 * @Description :
 */
public class Test {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject("家庭成员");
        Observer player1,player2,player3,player4;

        player1 = new ConcreteObserver("爸爸");
        concreteSubject.registerObserver(player1);
        player2 = new ConcreteObserver("妈妈");
        concreteSubject.registerObserver(player2);
        player3 = new ConcreteObserver("爷爷");
        concreteSubject.registerObserver(player3);
        player4 = new ConcreteObserver("奶奶");
        concreteSubject.registerObserver(player4);

        concreteSubject.sendMessage("宝宝饿了");

    }
}
