package thread;

import java.util.List;
import java.util.Random;

public class AProducer implements Runnable {
    private List<Integer> list;
    private int maxLength;

    public AProducer(List list, int maxLength) {
        this.list = list;
        this.maxLength = maxLength;
    }

    @Override
    public void run() {
        synchronized (list) {
            while (list.size() == maxLength) {
                System.out.println("生产者" + Thread.currentThread().getName() + "list已达到最大容量，进行wait");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("生产者" + Thread.currentThread().getName() + "退出wait");

            }
            Random random = new Random();
            int i = random.nextInt();
            System.out.println("生产者" + Thread.currentThread().getName() + "生产数据" + i);
            list.add(i);
            list.notifyAll();
        }
    }
}
