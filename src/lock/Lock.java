package lock;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Lock {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private ReentrantLock lock = new ReentrantLock();    //注意这个地方
    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    public static void main(String[] args)  {
        final Lock lock = new Lock();

        new Thread(){
            public void run() {
                lock.insert(Thread.currentThread());
            };
        }.start();

        new Thread(){
            public void run() {
                lock.insert(Thread.currentThread());
            };
        }.start();
    }

    public void insert(Thread thread) {
        //lock不能在这里创建，如果在此创建lock变量是局部变量，每个线程
        //执行该方法时都会保存一个副本，那么理所当然每个线程执行到lock.lock()处获取的是不同的锁，所以就不会发生冲突。
        //ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            System.out.println(thread.getName()+"得到了锁");
            for(int i=0;i<5;i++) {
                arrayList.add(i);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }finally {
            System.out.println(thread.getName()+"释放了锁");
            lock.unlock();
        }
    }
}