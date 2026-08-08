class Solution {
    public String removeOuterParentheses(String s) {
        int l = s.length();
        int outer = 0;
        StringBuilder ans = new StringBuilder();
        int stack = 0;

        for (char ch : s.toCharArray()) {
            if (stack == 0 && ch == '(') {
                stack = 1;
            }
            else if (ch == '(' && outer >= 0) {
                outer++;
                ans.append(ch);
            }
            else if (ch == ')' && outer != 0) {
                outer--;
                ans.append(ch);
            }
            else if (stack == 1 && ch == ')' && outer == 0) {
                stack = 0;
            }
        }
        return ans.toString();
    }
}