package oddAndEven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedOnly {

    private static int count = 0;
    private static Object lock = new Object();

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(()->{
            while(count < 100){
                synchronized (lock){
                    System.out.println("偶数: " + count);
                    count++;
                    //释放奇数线程
                    lock.notify();
                    if (count < 100){
                        try {
                            //防止偶数线程执行
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });

        executorService.execute(()->{
            while(count < 100){
                synchronized (lock){
                    System.out.println("奇数: " + count);
                    count++;

                    lock.notify();
                    if(count < 100){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }


}
