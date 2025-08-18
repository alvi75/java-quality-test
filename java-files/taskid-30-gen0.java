class Problem {
    /**
     * Given a string s consisting of lowercase and uppercase English letters,
     * you need to make the string "good".
     * A string is considered "good" if there are no adjacent characters such that
     * one is a lowercase letter and the other is the corresponding uppercase letter.
     * You can choose any adjacent characters in the string and remove them until the string is "good".
     * Return the final "good" string.
     *
     * Example 1:
     * Input: s = "leEeetcode"
     * Output: "leetcode"
     * Explanation: You can remove "Ee" to make "leetcode".
     *
     * Example 2:
     * Input: s = "abBAcC"
     * Output: ""
     * Explanation: There are multiple possible solutions, such as:
     * - Remove "bB" to make "aAcC", then remove "cC" to make "aA", then remove "aA" to make "".
     * - Remove "aA" to make "abBAcC", then remove "bB" to make "aAcC", then remove "cC" to make "aA",
     *   then remove "aA" to make "".
     * No matter the choices, the result is an empty string.
     *
     * Example 3:
     * Input: s = "s"
     * Output: "s"
     * Explanation: The string is already "good".
     */
  public String makeGood(String s){
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (sb.length() > 0 && Math.abs(sb.charAt(sb.length() - 1) - c) == 32) {
        sb.deleteCharAt(sb.length() - 1);
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}


This problem can be solved by using a stack. We iterate over the string from left to right. If the stack is not empty and the absolute difference between the last character in the stack and the current character is 32 (which is the ASCII value of 'A'-'a'+1), we pop the last character from the stack. Otherwise, we push the current character to the stack.

The time complexity of this solution is O(n), where n is the length of the string, and the space complexity is also O(n), where n is the length of the string, because we use a stack to store the characters.