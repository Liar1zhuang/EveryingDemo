package thread;

import java.util.concurrent.BlockingQueue;

public class BConsumer implements Runnable {
    private BlockingQueue queue;

    public BConsumer(BlockingQueue queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while(true){
            try {
                int element = (Integer) queue.take();
                System.out.println("消费者" + Thread.currentThread().getName() + "正在消费数据" + element);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
