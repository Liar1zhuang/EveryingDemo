package factory.simple;

public class Rectangle implements Shape {


    public Rectangle() {
        System.out.println("Rectangle created!");
    }

    @Override
    public void draw() {
        System.out.println("This is a Rectangle!");
    }
}
