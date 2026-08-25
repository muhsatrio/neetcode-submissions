class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();

        int left = -1, right = -1;

        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];

            if (maps.containsKey(complement)) {
                left = maps.get(complement);
                right = i;
                break;
            }

            maps.put(nums[i], i);
        }

        int[] result = new int[]{left, right};

        return result;
    }
}
