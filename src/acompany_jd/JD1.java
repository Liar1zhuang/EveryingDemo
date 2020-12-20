package acompany_jd;

import java.util.Scanner;

//输入一个n，代表第n个由2、3、5组成的数，顺序由小到大排序
//思路：模拟数字的生成过程，从最高位到最低位找到规律
public class JD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int res = 0;
            int fix3 = 3;
            int count = 1;
            int times = 1;
            while (n > fix3) {
                count++;
                n -= fix3;
                fix3 *= 3;
            }
            fix3 /= 3;
            for (int i = 0; i < count; i++) {
                res *= 10;
                if (n <= fix3) {
                    res += 2;
                } else if (n <= 2 * fix3) {
                    res += 3;
                } else {
                    res += 5;
                }
                times = n/fix3;
                n %= fix3;
                if (n == 0) {
                    n = 3*times;
                }
                fix3 /= 3;
            }
            System.out.println(res);
        }
    }
}
