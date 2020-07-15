package thread;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class BProducer implements Runnable {
    private BlockingQueue queue;

    public BProducer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            Random random = new Random();
            Integer i = random.nextInt();
            System.out.println("生产者" + Thread.currentThread().getName() + "生产数据" + i);
            queue.put(i);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}