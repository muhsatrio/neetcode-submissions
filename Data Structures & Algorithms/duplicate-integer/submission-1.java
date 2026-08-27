// Input: nums = [1, 2, 3, 3]

// Output: true

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (Integer num : nums) {
            maps.put(num, maps.getOrDefault(num, 0) + 1);
        }

        for (Integer value : maps.values()) {
            if (value > 1) return true;
        }

        return false;
    }
}