package lock;

public class Synchronized {

    //交替打印奇偶数,错误代码
    private static volatile Integer count = 1;

    public static void main(String[] args) {
        //奇数线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 10) {
                    synchronized (count) {
                        if (count % 2 == 1) {
                            System.out.println("打印奇数的线程" + count);
                            count++;
                        }
                    }
                }
            }
        }).start();
        //偶数线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 10) {
                        synchronized (count) {
                            if (count % 2 == 0) {
                                System.out.println("打印偶数的线程" + count);
                                count++;
                            }
                        }
                }
            }
        }).start();
    }
}
