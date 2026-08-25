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
