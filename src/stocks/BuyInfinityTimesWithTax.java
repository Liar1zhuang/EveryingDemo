package stocks;

//给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
//你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
//返回获得利润的最大值。
//注意：这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。

public class BuyInfinityTimesWithTax {
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int dp0 = 0;
        int dp1 = -prices[0]-fee;
        for(int i = 0;i < n;i++){
            dp0 = Math.max(dp0,dp1+prices[i]);
            //多了手续费只需要在每次购买时将利润减一次手续费即可
            dp1 = Math.max(dp1,dp0-prices[i]-fee);
        }
        return dp0;
    }
}