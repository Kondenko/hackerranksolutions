package com.vladimirkondenko.leetcode.besttimetobuyandsellstock2;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
class Solution {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - prices[i - 1];
            if (currentProfit > 0) {
                profit += currentProfit;
            }
        }
        return profit < 0 ? 0 : profit;
    }

}
