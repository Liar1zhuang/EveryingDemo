package acompany_glodon;

public class Glodon4 {
    public static void main(String[] args) {
        int n = 3;
        int c = 15;
        int[] volume = {5,9,8};
        int[] happiness = {16,1,15};
        System.out.println(maxHappiness(n,c,volume,happiness));
    }

    public static int maxHappiness(int n,int c,int[] volume,int[] happiness){

        int[][] dp = new int[n+1][c+1];
        for(int i = 0;i <= n;i++){
            for(int j = 0;j <= c;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                    continue;
                }
                if(j < volume[i-1]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j-volume[i-1]] + happiness[i-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][c];
    }
}
