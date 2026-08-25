class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> maps = new HashMap<>();

        int result = 0;

        int left = 0;

        for (int right=0; right<s.length(); right++) {
            if (maps.containsKey(s.charAt(right))) {
                int lastSeenIndex = maps.get(s.charAt(right));
                left = Math.max(left, lastSeenIndex+1);
            }

            maps.put(s.charAt(right), right);

            result = Math.max(result, right-left+1);
        }

        return result;
    }
}
