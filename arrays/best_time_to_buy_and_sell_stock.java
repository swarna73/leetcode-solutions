public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // update minimum price (best buy)
            } else {
                // calculate profit if sold today
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit; // update max profit
                }
            }
        }

        return maxProfit;
    }
}
