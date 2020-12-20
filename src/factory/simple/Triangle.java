package factory.simple;

public class Triangle implements Shape{
    public Triangle() {
        System.out.println("Triangle created!");
    }

    @Override
    public void draw() {
        System.out.println("This is a Triangle!");
    }
}
