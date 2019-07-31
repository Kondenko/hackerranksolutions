package com.vladimirkondenko.leetcode.besttimetobuyandsellstock;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
class Solution {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit < 0 ? 0 : profit;
    }

}
