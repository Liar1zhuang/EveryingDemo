package acompany_jd;

import java.util.Scanner;

//京东第一题的暴力解法：
//从2开始遍历，遇到只由2、3、5组成的数字便将count加一，等加到与n相等时，就找到了要求的数字
public class JD1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = 0;
        for (Integer i = 2; i < Integer.MAX_VALUE; i ++ ) {
            String tmp = i.toString();
            tmp = tmp.replace("2","").replace("3", "").replace("5", "");
            if (tmp.length() == 0) {
                temp++;
            }
            if (temp == n) {
                System.out.println(i);
                break;
            }

        }
    }
}
