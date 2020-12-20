package html;

import java.util.Scanner;

public class bigNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            StringBuilder sb = new StringBuilder("1");
            for(int i = 1;i <= n;i++){
                int len = sb.length();
                int temp = 0;
                for(int j = len-1;j >= 0;j--){
                    temp = ((sb.charAt(j) - '0') << 1) + temp/10;
                    sb.setCharAt(j,(char)(temp%10 + '0'));
                }
                if(temp/10 == 1){
                    sb.insert(0,'1');
                }
            }
            System.out.println(sb);
        }
    }
}
