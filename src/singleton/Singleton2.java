package singleton;

//懒汉模式
// 静态对象在第一次调用时初始化，第一次加载是速度慢，且多线程下不能工作
public class Singleton2 {
    private Singleton2(){};

    private static Singleton2 instance;

    public static Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
