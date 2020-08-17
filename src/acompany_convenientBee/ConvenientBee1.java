package acompany_convenientBee;

import java.util.Scanner;

public class ConvenientBee1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        String w = sc.next();
        String[] width = w.split(",");
        String v = sc.next();
        String[] value = v.split(",");

        int[] widths = new int[width.length];
        int[] values = new int[value.length];
        for (int i = 0; i < width.length; i++) {
            widths[i] = Integer.parseInt(width[i]);
            values[i] = Integer.parseInt(value[i]);
        }
        System.out.println(layout(length, widths, values));


    }

    public static int layout(int length, int[] widths, int[] values) {
        int n = widths.length;
        int[][] dp = new int[n + 1][length + 1];

        for (int i = 0; i <= n; i++) {
            for (int l = 0; l <= length; l++) {
                if (i == 0 || l == 0) {
                    dp[i][l] = 0;
                    continue;
                }
                if (l < widths[i-1]) {
                    dp[i][l] = dp[i - 1][l];
                } else {
                    dp[i][l] = Math.max(dp[i - 1][l], dp[i - 1][l - widths[i - 1]] + values[i - 1]);
                }
            }
        }
        return dp[n][length];
    }
}
