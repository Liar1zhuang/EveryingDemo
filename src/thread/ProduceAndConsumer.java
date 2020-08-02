package thread;

import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

//生产者消费者模型
public class ProduceAndConsumer {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        LinkedList linkedlist = new LinkedList();
//        ExecutorService executor = Executors.newFixedThreadPool(10);



        Thread t1 = new Thread(new BConsumer(queue));
        Thread t2 = new Thread(new BProducer(queue));
//        for(int i = 0;i < 5;i++)
//        {
//            executor.submit(new ProducerA(linkedlist,8));
//        }
//
//        for(int i = 0;i < 10;i++)
//        {
//            executor.submit(new ConsumerA(linkedlist));
//        }

//线程池创建线程
//        for(int i = 0;i < 5;i++)
//        {
//            executor.submit(new BProducer(queue));
//        }
//        for(int i = 0;i < 10;i++)
//        {
//            executor.submit(new BConsumer(queue));
//        }
    }
}
