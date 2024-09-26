package t2;

/**
 * @Author : taoxy
 * @Date: 2024/9/24 10:32
 * @Description :
 */
public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        //Thread 有两个构造函数 1.Thread(Runnable target) 2.Thread(Runnable target,String name)
        // 可以传递Runnable接口 说明构造函数支持传入一个 Runnable 接口的对象

        //另外 Thread 类也实现了Runnable接口 由此说明 还可以传入一个Thread 对象，
        // 这样就可以将一个Thread 类的对象run()方法交由其他的线程进行调用
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
