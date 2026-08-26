class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> maps = new HashMap<>();

        // for (char c : s.toCharArray()) {
        //     maps.put(c, maps.getOrDefault(c, 0) + 1);
        // }

        int left = 0;

        int maxFreq = 0;

        int result = 0;

        for (int right=0; right < s.length(); right++) {
            maps.put(s.charAt(right), maps.getOrDefault(s.charAt(right), 0) + 1);

            maxFreq = Math.max(maxFreq, maps.get(s.charAt(right)));

            if ((right-left+1) - maxFreq > k) {
                maps.put(s.charAt(left), maps.get(s.charAt(left)) - 1);
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
    }
}
