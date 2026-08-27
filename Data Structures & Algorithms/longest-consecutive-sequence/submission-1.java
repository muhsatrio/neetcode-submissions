// ARRAY AND HASHING + HASH TABLE + UNION FIND

// Input: nums = [2,20,4,10,3,4,5]

// Output: 4

// Explanation: The longest consecutive sequence is [2, 3, 4, 5].

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> sets = new HashSet<>();

        for (Integer num : nums) {
            sets.add(num);
        }

        int result = 0;

        for (Integer num : sets) {
            if (!sets.contains(num-1)) {
                int currentNum = num;
                int maxLen = 1;

                while (sets.contains(currentNum+1)) {
                    currentNum++;
                    maxLen++;
                }

                result = Math.max(result, maxLen);
            }
        }

        return result;
    }
}
