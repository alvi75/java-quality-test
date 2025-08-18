class Problem {
    /**
    * Given a string s composed of '(' and ')', the left and right brackets in s may be unbalanced. Each operation can insert a '(' or ')', and calculate the minimum number of insertion operations required. Make the left and right brackets in s balanced.
    *
    * Example 1:
    * Input: s = "(()))"
    * Output: 1
    * Explanation:  We need to add one '(' at the first of the string to make it balanced: "((()))".
    * Example 2:
    * Input: s = "((()))"
    * Output: 0
    *
    * - s consists of '(' and ')' only.
    */
 public int minInsertions(String s){
        int ans = 0, i = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                i += 2;
                if (i % 2 != 0) ans++;
            } else {
                i--;
                if (i < 0) {
                    ans++;
                    i++;
                }
            }
        }
        return ans + i;
    }
}


This problem is about counting the number of unbalanced brackets in a string. The idea is to count the number of unbalanced brackets and add the number of extra '(' needed to make the string balanced.

The function `minInsertions` iterates over the string `s`. If it encounters a '(', it increments the counter `i`. If `i` is odd, it means there is an unbalanced '(', so we need to add one '('.

If it encounters a ')', it decrements `i`. If `i` becomes negative, it means there is an unbalanced ')', so we need to add one ')' to the result and increment `i`.

Finally, we add the remaining `i` to the result.

This solution has a time complexity of O(n), where n is the length of the string, and a space complexity of O(1), as it only uses a constant amount of space.