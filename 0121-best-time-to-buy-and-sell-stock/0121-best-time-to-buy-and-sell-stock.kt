class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit = 0
        var buy = 0
        var sell = 1

        while (sell < prices.size) {
            if (prices[buy] > prices[sell]) {
                buy++
                sell = buy + 1
            } else {
                profit = maxOf(profit, prices[sell] - prices[buy])

                sell++
            }
        }

        return profit
    }
}