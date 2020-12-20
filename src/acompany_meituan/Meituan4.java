package acompany_meituan;

import java.util.Scanner;

public class Meituan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int cut = 0;
            int count = 0;
            String s = sc.next();
            if(n == 1 && (s.equals("A") || s.equals("Z") )){
                System.out.println(2);
                continue;
            }else if(n == 1 && (!s.equals("A") && !s.equals("Z"))){
                System.out.println(3);
                continue;
            }
            while(s.length() >= 2){
                if(s.charAt(0) == 'A' || s.charAt(0) == 'Z'){
                    cut++;
                }
                if(s.charAt(s.length()-1) == 'A' || s.charAt(s.length()-1) == 'Z'){
                    cut++;
                }
                for(int i = 1;i < s.length()-2;i++){
                    if(s.charAt(i) == 'A' || s.charAt(i) == 'Z'){
                        cut += 2;
                    }
                }
                break;
            }
            count = (2*n-1-cut) % 998244353;
            System.out.println(count);
        }
    }
}
