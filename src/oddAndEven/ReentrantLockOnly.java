package oddAndEven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockOnly {

    private static volatile int count = 0;
    private static volatile boolean flag = true;

    private static final ReentrantLock lock = new ReentrantLock();


    public static void main(String[] args) {
        // 启用线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        // 先从0，偶数开始
        executorService.execute(() -> {
            while (count < 10) {
                try {
                    lock.lock();
                    System.out.println("偶: " + count);
                    count++;
                    // 只有flag变为true了，此线程才不会接着执行，将争夺权给奇数线程
                    flag = true;
                } finally {
                    lock.unlock();
                }
                if(count < 10){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        executorService.execute(() -> {
            while (count < 10) {
                try {
                    lock.lock();
                    System.out.println("奇: " + count);
                    count++;
                    // 让出CPU
                    flag = false;
                } finally {
                    lock.unlock();
                }
                if(count < 10){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        executorService.shutdown();
    }

}
