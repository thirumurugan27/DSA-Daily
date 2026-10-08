class Solution {
    public String removeOuterParentheses(String str) {
        StringBuilder res = new StringBuilder();
        int balance = 0;

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                if (balance > 0) {
                    res.append(ch);
                }
                balance++;
            } else {
                balance--;
                if (balance > 0) {
                    res.append(ch);
                }
            }
        }
        return res.toString();
    }
}