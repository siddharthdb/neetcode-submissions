class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                // verify matching pair here
                switch (top) {
                    case '(':
                        if (c != ')')
                            return false;
                        break;
                    case '{':
                        if (c != '}')
                            return false;
                        break;
                    case '[':
                        if (c != ']')
                            return false;
                        break;
                }
            }
        }

        return stack.isEmpty();
    }
}
