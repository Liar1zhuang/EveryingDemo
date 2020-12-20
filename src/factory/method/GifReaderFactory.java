package factory.method;

public class GifReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new GifReader();
    }
}
