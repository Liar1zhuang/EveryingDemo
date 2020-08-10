package stocks;

public class BuyInfinityTimesWithFrozenTime {
    //给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
    //设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
    //你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
    //卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。

    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0){
            return 0;
        }
        //状态增加一个冷冻状态
        int[][] dp = new int[n][3];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        dp[0][2] = 0;

        for(int i = 1;i < n;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //当前状态手上持有股票： 1、上一状态就持有股票 2、上一状态没有股票且处于冷冻期，当前状态买入
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][2] -prices[i]);
            //冷冻状态的值为上一个不持有股票的状态
            dp[i][2] = dp[i-1][0];
        }
        return Math.max(dp[n - 1][0], dp[n - 1][2]);
    }
}
