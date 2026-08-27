// TWO POINTER

// Input: s = "Was it a car or a cat I saw?"

// Output: true

// Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\s+", "");
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        int left = 0, right = s.length() - 1;

        while (left < right && s.charAt(left) == s.charAt(right)) {
            left++;
            right--;
        }

        return left >= right;
    }
}
