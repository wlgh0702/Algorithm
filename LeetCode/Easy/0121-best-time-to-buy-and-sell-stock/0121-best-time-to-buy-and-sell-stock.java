class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;

        int buyPrice = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            }

            if(prices[i] - buyPrice > profit) {
                profit = prices[i] - buyPrice;
            }
        }
        return profit;
    }
}