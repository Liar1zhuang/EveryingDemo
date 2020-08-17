package acompany_shell;

import java.util.Scanner;
import java.lang.Math;

public class Shell2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int group = sc.nextInt();
            for(int i = 0;i < group;i++){
                long N = sc.nextLong();
                long M = sc.nextLong();
                long sum = N*M;
                if(sum % 2 == 0){
                    System.out.println(2);
                }else if(N == 1 && M % 2 != 0){
                    System.out.println(M);
                }else if(M == 1 && N % 2 != 0){
                    System.out.println(N);
                }else{
                    System.out.println(Math.min(N,M));
                }
            }
        }
    }
}
