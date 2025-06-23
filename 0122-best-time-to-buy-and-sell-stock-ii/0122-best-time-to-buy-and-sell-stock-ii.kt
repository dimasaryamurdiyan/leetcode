class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        for (i in 1..prices.size-1) {
            if (prices[i] > prices[i-1])
                profit += prices[i] - prices[i-1]
        }

        return profit
    }
}