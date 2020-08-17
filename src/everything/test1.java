package everything;

public class test1 {
    public static void main(String[] args) {
//        B1 newB = new B1();
        System.out.println(B1.c1);
    }
}

class A1 {
    static {
        System.out.println("A1");
    }
}

class B1 extends A1{
    static {
        System.out.println("B1");
    }
    //final修饰的变量为常量，在编译时就被放到了类所对应的常量池，所以在用类名进行引用时并没有触发类加载
    public static final String c1 = "C1";
}


