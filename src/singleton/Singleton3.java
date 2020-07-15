package singleton;

//懒汉模式
// 线程安全，能在多线程下工作，但每次调用方法时都需要进行同步，开销较大，不建议使用
public class Singleton3 {
    private Singleton3(){};

    private static Singleton3 instance;

    public static synchronized Singleton3 getInstance(){
        if(instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}
