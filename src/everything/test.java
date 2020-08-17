package everything;

public class test {
    public static void main(String[] args) {
        System.out.println(B.c);
    }
}

class A{
    static {
        System.out.println("A");
    }
}

class B extends A{
    static {
        System.out.println("B");
    }
    public static final int getNum(){
        return 2;
    }
    public static final String c = new String("C");
}
