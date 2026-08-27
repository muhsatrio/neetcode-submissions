// SLIDING WINDOW

// Input: prices = [10,1,5,6,7,1]

// Output: 6

// Explanation: Buy prices[1] and sell prices[4], profit = 7 - 1 = 6.

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;

        int result = 0;

        for (int right=1; right<prices.length; right++) {
            int currSum = prices[right] - prices[left];

            if (prices[right] > prices[left]) {
                int currProfit = prices[right] - prices[left];
                result = Math.max(result, currProfit);
            } else {
                left = right;
            }
        }

        return result;
    }
}
