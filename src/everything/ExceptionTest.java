package everything;

public class ExceptionTest {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            int a = 10;
            int b;
            try {
                b = a/0;
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(a);
            Thread.sleep(3000);
        }
    }
}
