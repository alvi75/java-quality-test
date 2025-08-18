class Problem {

  /**
   * Calculate the number of times the digit 1 appears in all non-negative integers less than or equal to n.
   *
   * @param n An integer representing the upper limit.
   * @return The number of times the digit 1 appears.
   *
   * Example:
   * countDigitOne(13)
   * Output: 6
   *
   * Example:
   * countDigitOne(0)
   * Output: 0
   */
  public static int countDigitOne(int n){
    int count = 0;
    for (int i = 1; i <= n; i++) {
      count += Integer.toString(i).length() - Integer.toString(i).replace("1", "").length();
    }
    return count;
  }
}


This problem is about counting the number of times the digit 1 appears in all non-negative integers less than or equal to n. The key to solve this problem is to understand the pattern of the numbers.

The number of times the digit 1 appears in a number is equal to the number of digits in the number minus the number of non-1 digits.

For example, the number 13 has 3 digits (1, 3, 1), and the number 13 itself has 3 non-1 digits (1, 3, 1). So, the number of times the digit 1 appears in 13 is 3 - 3 = 0.

The same pattern applies to any number less than or equal to n.

The time complexity of this solution is O(n), where n is the input number. This is because we are iterating over all numbers from 1 to n.

The space complexity is O(1), as we are not using any extra space that scales with the input size.