package singleton;

//静态内部类
//第一次加载类时不会初始化对象，只有调用getInstance方法时才会加载内部的类并初始化对象，这样不仅能保证线程安全，也能保证对象的唯一性
public class Singleton5 {
    private Singleton5(){};

    public static Singleton5 getInstance(){
        return SingletonHolder.instance;
    }

    private static class SingletonHolder{
        private static Singleton5 instance = new Singleton5();
    }
}
