package factory.method;

public class PngReader implements Reader{

    @Override
    public void read() {
        System.out.println("read png");
    }
}
