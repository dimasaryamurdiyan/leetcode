class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var buy = prices[0]
        
        for (i in prices.indices) {
            if (buy > prices[i]) {
                buy = prices[i]
            }

            profit = maxOf(profit, prices[i] - buy)
        }

        return profit
    }
}