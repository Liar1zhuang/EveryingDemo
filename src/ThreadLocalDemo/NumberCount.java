package ThreadLocalDemo;

public class NumberCount {
    private static ThreadLocal<Integer> countNumber = ThreadLocal.withInitial(() -> 0);

    public int next(){
        countNumber.set(countNumber.get() + 1);
        return countNumber.get();
    }

    public static void main(String[] args) {
        NumberCount numberCount = new NumberCount();
        CountNumThread t1 = new CountNumThread(numberCount);
        CountNumThread t2 = new CountNumThread(numberCount);
        CountNumThread t3 = new CountNumThread(numberCount);
        t1.start();
        t2.start();
        t3.start();
    }
}
