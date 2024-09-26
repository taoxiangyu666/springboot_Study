package threadTest;

/**
 * @Author : taoxy
 * @Date: 2024/9/24 9:47
 * @Description : 多线程第一种实现方式 继承thread,重写run()方法
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
