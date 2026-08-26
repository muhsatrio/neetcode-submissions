// ARRAY AND HASHING + HASH TABLE + UNION FIND

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
