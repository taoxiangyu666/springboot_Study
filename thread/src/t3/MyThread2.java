package t3;

/**
 * @Author : taoxy
 * @Date: 2024/9/24 10:52
 * @Description :
 */
public class MyThread2 extends Thread{
    private int count = 5;
    @Override
    public synchronized void run() {
        super.run();
        count--;
        System.out.println("由 " +this.currentThread().getName() +" 计算， count = "+count);
    }
}
