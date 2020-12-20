package acompany_shell;

import java.util.Scanner;

public class Shell4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            String[] s = new String[4];
            s[0] = sc.next();
            s[1] = sc.next();
            s[2] = sc.next();
            s[3] = sc.next();
            int left = 0,right = 0;
            if(s[0].equals("S")&&s[2].equals("J") || s[0].equals("J")&&s[2].equals("B") || s[0].equals("B")&&s[2].equals("S")){
                left++;
            }
            if(s[0].equals("S")&&s[3].equals("J") || s[0].equals("J")&&s[3].equals("B") || s[0].equals("B")&&s[3].equals("S")){
                left++;
            }
            if(s[1].equals("S")&&s[2].equals("J") || s[1].equals("J")&&s[2].equals("B") || s[1].equals("B")&&s[2].equals("S")){
                right++;
            }
            if(s[1].equals("S")&&s[3].equals("J") || s[1].equals("J")&&s[3].equals("B") || s[1].equals("B")&&s[3].equals("S")){
                right++;
            }
            if(left == right){
                System.out.println("same");
            }else{
                System.out.println(left > right ? "left" : "right");
            }
        }
    }
}
