class Problem {

  /**
   * Given an integer n, add a dot ('.') as a thousand separator every three digits and return the result as a string.
   *
   * @param n The integer to add thousand separators to.
   * @return The string with thousand separators added.
   *
   * Example:
   * addThousandSeparator(987)
   * Output: "987"
   *
   * Example:
   * addThousandSeparator(1234)
   * Output: "1.234"
   *
   * Example:
   * addThousandSeparator(123456789)
   * Output: "123.456.789"
   *
   * Example:
   * addThousandSeparator(0)
   * Output: "0"
   */
  public static String addThousandSeparator(int n){
    if (n == 0) {
      return "0";
    }

    StringBuilder sb = new StringBuilder();
    String str = String.valueOf(n);

    for (int i = 0; i < str.length(); i++) {
      sb.append(str.charAt(i));
      if ((str.length() - i) % 3 == 0 && i != str.length() - 1) {
        sb.append(".");
      }
    }

    return sb.toString();
  }
}


This solution works by converting the integer to a string, then iterating over the characters in the string. If the current character is a third digit from the end of the string, it appends a dot to the result string.

The time complexity of this solution is O(n), where n is the number of digits in the input integer. The space complexity is also O(n), as we need to store the result string.