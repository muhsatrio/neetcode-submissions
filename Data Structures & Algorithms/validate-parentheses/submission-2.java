class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> maps = new HashMap<>();

        maps.put(')', '(');
        maps.put('}', '{');
        maps.put(']', '[');

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') stack.add(c);
            else {
                if (stack.empty()) return false;

                char lastC = stack.pop();

                if (maps.get(c) != lastC) return false;
            }
        }

        if (!stack.empty()) return false;

        return true;
    }
}
