package acompany_convenientBee;

import java.util.Scanner;

public class ConvenientBee2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < s.length();i+=2){
            int n = s.charAt(i) - '0';
            for(int j = 0;j < n;j++){
                res.append(s.charAt(i+1));
            }
        }
        System.out.println(res.toString());
    }
}
