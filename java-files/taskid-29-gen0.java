class Problem {
    /**
     * Given two positive integers n and k, find the kth factor of n.
     * A factor of n is a positive integer that divides n evenly.
     * Return the kth factor in ascending order. If n has less than k factors, return -1.
     *
     * Example 1:
     * Input: n = 12, k = 3
     * Output: 3
     * Explanation: The factors of 12 are [1, 2, 3, 4, 6, 12]. The 3rd factor is 3.
     *
     * Example 2:
     * Input: n = 7, k = 2
     * Output: 7
     * Explanation: The factors of 7 are [1, 7]. The 2nd factor is 7.
     *
     * Example 3:
     * Input: n = 4, k = 4
     * Output: -1
     * Explanation: The factors of 4 are [1, 2, 4]. There is no 4th factor, so we return -1.
     */
    public int kthFactor(int n, int k){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        return -1;
    }
}


This problem can be solved by iterating from 1 to n and checking if the current number is a factor of n. If it is, increment a counter and if the counter equals k, return the current number. If the counter does not equal k, return -1.

The time complexity of this solution is O(n), where n is the input number. This is because we are iterating from 1 to n, and for each number, we are performing a constant amount of work (checking if it's a factor of n).

The space complexity of this solution is O(1), because we are using a constant amount of space to store the counter and the current number.