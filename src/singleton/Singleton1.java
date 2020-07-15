package singleton;

//饿汉模式
//这种模式在类加载时完成初始化，因此类加载速度慢，但是获取对象的速度快，这种方法没有达到懒加载的效果
public class Singleton1 {
    private Singleton1(){};

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance(){
        return instance;
    }
}
