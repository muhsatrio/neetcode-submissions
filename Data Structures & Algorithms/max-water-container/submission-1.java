// TWO POINTER

// Input: height = [1,7,2,5,4,7,3,6]

// Output: 36

// Explanation: The bars at indices 1 and 7 have heights 7 and 6. The container has width 7 - 1 = 6 and height min(7, 6) = 6, so it can store 6 * 6 = 36 units of water. This is the maximum possible area.

class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;

        int result = 0;

        while (left < right) {
            result = Math.max(result, Math.min(heights[left], heights[right]) * (right-left));

            if (heights[left] < heights[right]) left++;
            else right--;
        }

        return result;
    }
}
