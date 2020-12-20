package reflection;

//反射的三种
public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException {
        //new对象
        Student student = new Student();
        Class object1 = student.getClass();
        System.out.println(object1.getName());

        //所在相对路径
        Class object2 = Class.forName("reflection.Student");
        System.out.println(object2.getName());

        //通过类名
        Class object3 = student.getClass();
        System.out.println(object3.getName());



    }
}
