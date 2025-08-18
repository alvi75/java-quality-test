class Problem {

  /**
   * Given an integer n, determine if it is a power of two.
   * If it is, return true; otherwise, return false.
   * A number n is a power of two if there exists an integer x such that n == 2^x.
   *
   * @param n The integer to be checked.
   * @return True if n is a power of two, false otherwise.
   *
   * Example:
   * isPowerOfTwo(1)
   * Output: true
   *
   * Example:
   * isPowerOfTwo(16)
   * Output: true
   *
   * Example:
   * isPowerOfTwo(3)
   * Output: false
   *
   * Example:
   * isPowerOfTwo(4)
   * Output: true
   *
   * Example:
   * isPowerOfTwo(5)
   * Output: false
   */
  public static boolean isPowerOfTwo(int n){
    if (n <= 0) {
      return false;
    }

    while (n % 2 == 0) {
      n /= 2;
    }

    return n == 1;
  }
}


This solution works by continuously dividing the number by 2 until it's no longer divisible. If at any point the number is not 1, it means the number is not a power of two. If the number is 1, it means the number is a power of two.

The time complexity of this solution is O(log n) because we are performing a logarithmic number of divisions. The space complexity is O(1) because we are not using any extra space that scales with the input size.