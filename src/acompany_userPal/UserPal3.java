package acompany_userPal;

import java.util.Arrays;

public class UserPal3 {
    public static void main(String[] args) {
        int n = 3;
        int[][] flights = {{0,1,100},
                {1,2,100},
                {2,0,500}};
        int src = 0;
        int[] res = findAllCheapestPrice(n,flights,src);
        for(int i = 0;i < n;i++){
            System.out.println(res[i]);
        }
    }

    public static int[] findAllCheapestPrice (int n, int[][] flights, int src) {
        // write code here
//        int[] res = new int[n];
        int[] dp = new int[n];
        int count = 0;
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[src] = 0;

        for (int[] flight : flights){
            if(dp[flight[0]] != Integer.MAX_VALUE){
                dp[flight[1]] = Math.min(dp[flight[1]],dp[flight[0]] + flight[2]);
                count++;
            }
        }
        for(int i =0;i < n;i++){
            if(dp[i] == Integer.MAX_VALUE){
                dp[i] = -1;
            }
        }
        return dp;
    }
}
