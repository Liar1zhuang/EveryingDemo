package singleton;

//懒汉模式 双重检查模式,该模式下也是volatile关键字使用的经典场景之一
//优点是效率高，缺点是第一次加载时稍慢一些，高并发环境下也有一定的缺陷
public class Singleton4 {
    private Singleton4(){};

    private volatile static Singleton4 instance;

    public static Singleton4 getInstance(){
        if(instance == null){
            synchronized(Singleton4.class){
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
