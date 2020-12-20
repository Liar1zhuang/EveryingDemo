package acompany_360;

import java.util.Scanner;

public class Group3601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            int v = sc.nextInt();
            int tempK = 1;
            int res = 0;
            while(a > 0){
                a -= v;
                //有隔板且还能一个箱子还能接着分的时候用箱子（先加隔板）
                while(a > 0 && tempK < k && b > 0){
                    b--;
                    tempK++;
                    a -= v;
                }
                tempK = 1;
                res++;
                //没隔板了，不用考虑k和b了
                while(b == 0 && a > 0){
                    a -= v;
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}
