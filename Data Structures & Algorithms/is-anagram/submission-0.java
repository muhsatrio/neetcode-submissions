class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] splittedS = s.toCharArray();
        char[] splittedT = t.toCharArray();

        Arrays.sort(splittedS);
        Arrays.sort(splittedT);

        for (int i=0; i<splittedS.length; i++) {
            if (splittedS[i] != splittedT[i]) return false;
        }

        return true;
    }
}
