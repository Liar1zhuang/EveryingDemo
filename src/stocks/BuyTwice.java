package stocks;

//给定一个数组，它的第 i 个元素是一支给定的股票在第 i 天的价格。
//设计一个算法来计算你所能获取的最大利润。你最多可以完成 两笔 交易。
public class BuyTwice {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0){
            return 0;
        }
        //需要三维数组保存状态:
        //第一维记录当前天数
        //第二维记录当前交易次数
        //第三维记录当前日期手中是否有股票（0代表没有股票，1代表持有股票）
        int[][][] dp = new int[n][3][2];
        for(int i = 0;i < n;i++){
            for(int j = 0;j <= 2;j++){
                //base case初始化
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
                dp[i][j][0] = Math.max(dp[i-1][j][0],dp[i-1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j][1],dp[i-1][j-1][0] - prices[i]);
            }
        }
        return dp[n-1][2][0];
    }
}
