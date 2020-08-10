package stocks;

//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。

public class BuyOnce {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0){
            return 0;
        }
        int dp0 = 0;
        int dp1 = -prices[0];
        for(int i =0;i < n;i++){
            //状态转移
            //当前状态手上没持有股票：1、上一状态就没有股票 2、上一状态持有股票但是当前状态卖掉
            dp0 = Math.max(dp0,dp1+prices[i]);
            //当前状态手上持有股票： 1、上一状态就持有股票 2、上一状态没有股票，当前状态买入（由于只能买入一次所以不需要加入之前的利润值）
            dp1 = Math.max(dp1,-prices[i]);
        }
        return dp0;
    }
}
