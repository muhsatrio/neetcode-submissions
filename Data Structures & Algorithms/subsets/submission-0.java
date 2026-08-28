// Input: nums = [1,2,3]

// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        backtrack(0, nums, new ArrayList<>(), results);

        return results;
    }

    void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> results) {
        results.add(new ArrayList<>(current));

        for (int i=start; i<nums.length; i++) {
            current.add(nums[i]);
            backtrack(i+1, nums, current, results);
            current.remove(current.size() - 1);
        }
    }
}
