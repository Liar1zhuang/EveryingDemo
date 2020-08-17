package acompany_tigerGroup;

import java.util.Scanner;

public class tigerGroup2 {
    public static void main(String[] args) {
        int[][] arr = {{1,3,1},
                {1,5,1},
                {4,2,1}};
        System.out.println(uniquePaths(arr));
    }
    public static int uniquePaths (int[][] arr) {
        // write code here
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = arr[0][0];
        for(int i = 1;i < m;i++){
            dp[i][0] += dp[i-1][0];
        }
        for(int j = 1;j < n;j++){
            dp[0][j] += dp[0][j-1];
        }
        for(int i = 2;i < m;i++){
            for(int j = 2;j < n;j++){
                dp[i][j] += Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
    }
}
