package acompany_shell;

import java.util.Scanner;

public class Shell5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count = 0;
        for(int i = 1;i <= s.length()/2;i++){
            String cur = s.substring(0,i);
            String post = s.substring(i,2*i);
            if(cur.equals(post)){
                count = Math.max(count,i);
            }
        }
        System.out.println(n-count+1);
    }
}
