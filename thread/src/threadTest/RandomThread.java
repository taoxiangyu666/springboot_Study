package threadTest;

import java.util.Random;

/**
 * @Author : taoxy
 * @Date: 2024/9/24 9:53
 * @Description : 验证多线程执行的随机性
 */
public class RandomThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                //随机休眠时间
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run = " +Thread.currentThread().getName());
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
