package stocks;

//给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
//设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。

public class BuyKTimes {
    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if(len == 0){
            return 0;
        }
        //如果K大于天数的一半，由于两天完成一笔有意义的交易，因此多余一半即为无限次交易
        //先单独处理无限次的情况，以防部分用例时间复杂度太大
        if(k>len/2){
            int[][] dp = new int[len][2];
            for(int i=0; i<len; i++){
                if(i == 0){
                    dp[0][0] = 0;
                    dp[0][1] = -prices[i];
                    continue;
                }
                dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
                dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
            }
            return dp[len-1][0];
        }
        //如果操作为有限次，即把操作2次的变量改为K即可
        int[][][] dp = new int[len][k+1][2];
        for(int i=0; i<len; i++){
            for(int j=0; j<=k; j++){
                if(i == 0){
                    dp[0][j][0] = 0;
                    dp[0][j][1] = -prices[i];
                    continue;
                }
                if(j == 0){
                    dp[i][0][0] = 0;
                    dp[i][0][1] = -prices[i];
                    continue;
                }
                dp[i][j][0] = Math.max(dp[i-1][j][0], dp[i-1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][0] - prices[i]);
            }
        }
        return dp[len-1][k][0];
    }
}
