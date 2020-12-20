package ThreadLocalDemo;

public class CountNumThread extends Thread{

    private NumberCount numberCount;

    CountNumThread(NumberCount numberCount){
        this.numberCount = numberCount;
    }

    public void run(){
        for(int i = 0;i < 5;i++){
            System.out.println(Thread.currentThread().getName() + "countNum" + numberCount.next());
        }
    }
}
