// ARRAY AND HASHING

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (int num : nums) {
            maps.put(num, maps.getOrDefault(num, 0) + 1);
        }

        Map<Integer, List<Integer>> freq = new TreeMap<>(Comparator.reverseOrder());

        for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            freq.computeIfAbsent(entry.getValue(), b -> new ArrayList<>()).add(entry.getKey());
        }

        int[] result = new int[k];

        int i = 0;

        for (List<Integer> values : freq.values()) {
            for (Integer value : values) {
                result[i] = value;
                if (i+1 == k) return result;
                i++;
            }
        }

        return result;
    }
}
