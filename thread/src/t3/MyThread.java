package t3;

/**
 * @Author : taoxy
 * @Date: 2024/9/24 10:40
 * @Description :
 */
public class MyThread extends Thread{

    private int count = 5;

    public MyThread(String name) {
        super(name);
        this.setName(name); //设置线程名字
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("由 " +this.currentThread().getName() +" 计算， count = "+count);
        }
    }
}
