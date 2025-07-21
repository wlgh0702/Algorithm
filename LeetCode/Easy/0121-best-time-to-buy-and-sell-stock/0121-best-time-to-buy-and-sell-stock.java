class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;

        int buy_price = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++) {
            if(buy_price > prices[i]) {
                buy_price = prices[i];
            }

            profit = (profit > prices[i] - buy_price)? profit : prices[i] - buy_price;
        }

        return profit;
    }
}