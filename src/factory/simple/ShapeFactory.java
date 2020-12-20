package factory.simple;

//简单工厂模式
//优点：简单、解耦
//特点：1、客户端不需要依赖具体的产品类，只依赖工厂类，传入不同的参数就可以得到不同的对象；
//2、工厂方法可以根据用户条件返回同一类型的不同子类；
//3、工厂方法中可以增加额外创建对象的细节，并且对客户端屏蔽这些细节。


//使用场景：1、需要创建的对象较少。
//　2、客户端不关心对象的创建过程。
public class ShapeFactory {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("circle");
        shape.draw();
    }
    public static Shape getShape(String type){
        Shape shape = null;
        if(type.equalsIgnoreCase("circle")){
            shape = new Circle();
        }else if(type.equalsIgnoreCase("rectangle")){
            shape = new Rectangle();
        }else if(type.equalsIgnoreCase("triangle")){
            shape = new Triangle();
        }
        return shape;
    }
}
