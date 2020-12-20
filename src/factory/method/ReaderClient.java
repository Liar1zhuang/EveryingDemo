package factory.method;

//和简单工厂对比一下，最根本的区别在于，简单工厂只有一个统一的工厂类
//而工厂方法是针对每个要创建的对象都会提供一个工厂类，这些工厂类都实现了一个工厂基类
public class ReaderClient {
    public static void main(String[] args) {
        ReaderFactory factory = new GifReaderFactory();
        Reader reader = factory.getReader();
        reader.read();

        ReaderFactory factory1 = new JpgReaderFactory();
        Reader reader1 = factory1.getReader();
        reader1.read();
    }
}
