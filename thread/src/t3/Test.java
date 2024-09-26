package t3;

/**
 * @Author : taoxy
 * @Date: 2024/9/24 10:44
 * @Description :
 */
public class Test {
    public static void main(String[] args) {
        MyThread myThreadA = new MyThread("A");
        MyThread myThreadB = new MyThread("B");
        MyThread myThreadC = new MyThread("C");

      //  myThreadA.start();
       // myThreadB.start();
      //  myThreadC.start();


        /**
         * 通过在run()方法前加上synchronized 关键字，使多个线程在执行run方法时，以排队的方式进行处理。当一个线程调用run方法前，
         * 先判断run方法上有没有上锁，如果上锁，说明有其他线程正在调用run方法，必须等到其他线程调用run方法结束后才可以执行run方法
         * 这样就实现了排队调用run方法的目的。
         * synchronized 可以在任意对象以及方法上加锁，加锁的这段代码被称为 互斥区 或者临界区
         *
         * 当一个线程想要执行同步方法里面的代码时，线程首先尝试获取到锁，如果能拿到这把锁就能执行synchronized里面的代码，如果不能
         * 拿到这把锁，那么这个线程会不断尝试获取这把锁，直到拿到为止，而且是多个线程同时去抢夺这把锁
         *
         * 非线程安全：只要是指多个线程对同一个对象童的同一个实例变量进行操作时会西出现值被更改、值不同步的情况，进而影响到程序的执行流程
         */
        MyThread2 myThread = new MyThread2();
        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();

    }
}
