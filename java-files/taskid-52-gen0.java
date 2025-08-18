class Problem {

  /**
   * Given an integer n, return the minimum number of perfect square numbers that sum up to n.
   *
   * @param n The target integer.
   * @return The minimum number of perfect square numbers.
   *
   * Example:
   * minPerfectSquareSum(12)
   * Output: 3
   *
   * Example:
   * minPerfectSquareSum(13)
   * Output: 2
   */
  public static int minPerfectSquareSum(int n){
    if (n < 2) return n;

    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;

    for (int i = 2; i <= n; i++) {
      int min = i;
      for (int j = 1; j * j <= i; j++) {
        min = Math.min(min, dp[i - j * j] + 1);
      }
      dp[i] = min;
    }

    return dp[n];
  }
}


This solution uses dynamic programming to solve the problem. The dp array stores the minimum number of perfect square numbers that sum up to i. For each i, we try to find the minimum number of perfect square numbers that sum up to i - j*j, where j ranges from 1 to sqrt(i).

The time complexity of this solution is O(n*sqrt(n)), and the space complexity is O(n).