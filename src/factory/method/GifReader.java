package factory.method;

public class GifReader implements Reader{

    @Override
    public void read() {
        System.out.println("read gif");
    }
}
