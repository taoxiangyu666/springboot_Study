package threadTest;

/**
 * @Author : taoxy
 * @Date: 2024/9/24 9:42
 * @Description : 多线程编程学习
 */
public class ThreadTest {
    public static void main(String[] args) {
       /*
        在控制台输出的"main" 其实就是一个名叫main的线程在执行main方法中饿代码！
        控制台输出的main和main方法没有任何的关系，仅仅是名字相同罢了
        */
        //System.out.println(Thread.currentThread().getName());


        /**
         *  控制台输出的顺序是 运行结束，myThread 说明多线程的使用时，代码的运行结果跟代码的执行顺序是无关的
         *  多线程执行是随机的
         */
       // MyThread myThread = new MyThread();
        //myThread.start();
       // System.out.println("运行结束");


        RandomThread randomThread = new RandomThread();
        randomThread.setName("RandomThread");
       /* 如果调用run()方法就不是异步执行了，而是同步，此时线程对象不会交给“线程规划器”来进行处理，
        而是由main主线程来调用run()方法，也就是必须等待run()方法执行完成才能执行下一步代码*/
        randomThread.run();
       /* start()方法通知"线程规划器"，此线程已经准备就绪，等待调用线程的run()方法，这个过程其实就是让系统安排一个时间来调用Thread的run()方法
        也就是 使线程得以运行，启动线程，具有异步执行的效果*/
        randomThread.start();
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main = "+ Thread.currentThread().getName());
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
