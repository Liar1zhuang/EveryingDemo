package oddAndEven;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


public class AtomicIntegerOnly {

    private static  AtomicInteger count = new AtomicInteger(0);
    private static volatile Boolean flag = true;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(()->{
            while(count.get() < 100){
                if(flag){
                    System.out.println("偶数: " + count.getAndIncrement());
                    flag = false;
                }
            }
        });

        executorService.execute(()->{
            while(count.get() < 100){
                if(!flag){
                    System.out.println("奇数: " + count.getAndIncrement());
                    flag = true;
                }
            }
        });

        executorService.shutdown();
    }
}
