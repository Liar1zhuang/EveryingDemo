package acompany_glodon;

import java.util.Scanner;

public class Glodon6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int C = sc.nextInt();
        float[] c = new float[n];
        int[] w = new int[n];
        for(int i = 0; i < n; ++i) {
            c[i] = sc.nextFloat();
            w[i] = sc.nextInt();
        }

        long[] dp = new long[C + 1];

        for(int i = 0; i < n; ++i) {
            for(int j = C; j >= c[i]; --j) {
                dp[j] = Math.max(dp[j], dp[(int)(j - c[i] + 0.5)] + w[i]);
            }
        }
        System.out.println(dp[C]);
    }
}
