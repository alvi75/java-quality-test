class Problem {

  /**
   * Find the smallest integer that can be formed by rearranging the digits of the given positive integer n, which is greater than n.
   *
   * @param n The input positive integer.
   * @return The smallest rearranged integer greater than n, or -1 if not possible.
   *
   * Example:
   * findSmallestInteger(12)
   * Output: 21
   */
  public static int findSmallestInteger(int n){
    String str = String.valueOf(n);
    char[] arr = str.toCharArray();
    Arrays.sort(arr);
    int min = n;
    do {
      min++;
    } while (Arrays.stream(String.valueOf(min).toCharArray()).sorted().toArray(), Arrays.equals(arr, String.valueOf(min).toCharArray()));
    return min;
  }
}


This solution works by first converting the input integer to a string, then sorting the characters in the string. The smallest integer that can be formed by rearranging the digits of the given integer is then found by incrementing the original integer and checking if the sorted string is equal to the string representation of the new integer. This process is repeated until a valid integer is found.

Please note that this solution assumes that the input integer is greater than 0. If the input integer can be 0, the solution should be modified to handle this case.