package acompany_ctrip;

public class Ctrip3 {
    public static void main(String[] args) {
        int m = 2,a = 5,b = 3,c = 3,x = 250;
        System.out.println(buyCoke(m,a,b,c,x));
    }
    static int buyCoke(int m,int a,int b,int c,int x){
        int res = 0;
        while(m > 0){
            m--;
            int count = 0;
            while(count < x && c > 0){
                count += 100;
                c--;
                res++;
            }
            while(count < x && b > 0){
                count += 50;
                b--;
                res++;
            }
            while(count < x && a > 0){
                count += 10;
                a--;
                res++;
            }
            b += (count-x) / 50;
            a += ((count-1)%50) / 10;
        }
        return res;
    }
}
