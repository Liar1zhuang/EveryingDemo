package factory.simple;

public class Circle implements Shape{

    public Circle(){
        System.out.println("Circle created!");
    }
    @Override
    public void draw() {
        System.out.println("This is a circle!");
    }
}
