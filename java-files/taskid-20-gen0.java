class Problem {
    /**
     * Given an integer array cost where cost[i] is the cost of ith step on a staircase,
     * return the minimum cost to reach the top of the floor.
     * You can either start from the step with index 0 or the step with index 1.
     *
     * Example:
     * >>> minCostClimbingStairs([10, 15, 20])
     * 15
     * Explanation: You will start at index 1.
     * - Pay 15 and climb two steps to reach the top.
     * The total cost is 15.
     *
     * >>> minCostClimbingStairs([1, 100, 1, 1, 1, 100, 1, 1, 100, 1])
     * 6
     * Explanation: You will start at index 0.
     * - Pay 1 and climb two steps to reach index 2.
     * - Pay 1 and climb two steps to reach index 4.
     * - Pay 1 and climb two steps to reach index 6.
     * - Pay 1 and climb one step to reach index 7.
     * - Pay 1 and climb two steps to reach index 9.
     * - Pay 1 and climb one step to reach the top.
     * The total cost is 6.
     */
  public int minCostClimbingStairs(int[] cost){
    int[] dp = new int[cost.length + 2];
    dp[0] = cost[0];
    dp[1] = cost[1];

    for (int i = 2; i < cost.length; i++) {
      dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
    }

    return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
  }
}


This solution uses dynamic programming to keep track of the minimum cost to reach each step. It starts by initializing the first two steps with the cost of the first two steps. Then, for each subsequent step, it calculates the minimum cost to reach that step by taking the minimum cost to reach the previous step (`dp[i - 1]`) and the step before that (`dp[i - 2]`). It then adds the cost of the current step to the minimum of these two values.

Finally, it returns the minimum cost to reach the last step, which is either the cost of the last step (`dp[cost.length - 1]`) or the cost of the second-to-last step (`dp[cost.length - 2]`). This is because you can either start at the first step or the second step, and the cost to reach the top of the floor is the minimum of the two costs.