class Solution {

    public String encode(List<String> strs) {
        String result = "";

        for (String str : strs) {
            result+=str.length() + "#" + str;
        }

        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int hashIndex = str.indexOf('#', i);

            int length = Integer.parseInt(str.substring(i, hashIndex));

            int start = hashIndex + 1;

            String subs = str.substring(start, start+length);

            result.add(subs);

            i = start + length;
        }
        return result;
    }
}
