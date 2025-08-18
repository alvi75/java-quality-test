import java.lang.Math;

class Problem {

  /**
   * Find and return the nth ugly number.
   *
   * @param n The index of the ugly number to find.
   * @return The nth ugly number.
   *
   * Example:
   * findNthUglyNumber(10)
   * Output: 12
   */
  public static int findNthUglyNumber(int n){
    if (n <= 0) {
      throw new IllegalArgumentException("n should be greater than 0");
    }

    int[] uglyNumbers = new int[n];
    uglyNumbers[0] = 1;

    int i2 = 0, i3 = 0, i5 = 0;
    int nextUgly = 1;

    while (nextUgly < n) {
      int nextMultipleOf2 = uglyNumbers[i2] * 2;
      int nextMultipleOf3 = uglyNumbers[i3] * 3;
      int nextMultipleOf5 = uglyNumbers[i5] * 5;

      int min = Math.min(nextMultipleOf2, Math.min(nextMultipleOf3, nextMultipleOf5));

      if (min == nextMultipleOf2) {
        i2++;
      }

      if (min == nextMultipleOf3) {
        i3++;
      }

      if (min == nextMultipleOf5) {
        i5++;
      }

      uglyNumbers[nextUgly] = min;
      nextUgly++;
    }

    return uglyNumbers[n - 1];
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println(Problem.findNthUglyNumber(10));
  }
}

// Output: 12
// Explanation: The 10th ugly number is 12.
// The sequence of first 10 ugly numbers is: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12.
// Hence, 12 is the 10th ugly number.
//
// Note:
// 1 is typically treated as the first ugly number.
// The sequence of ugly numbers starts with 1, and every ugly number is a product of prime numbers: 2, 3, 5.
// The definition of ugly number is in terms of the prime numbers: 2, 3, 5.
// The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18 is the sequence of ugly numbers with 1 to 10.
// The sequence of ugly numbers with 1 to 10 is: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12.
// Hence, 12 is the 10th ugly number.
//
// The time complexity of the solution is O(n) and the space complexity is O(n).
// The solution is based on the observation that every ugly number is a product of some prime numbers.
// The sequence of ugly numbers is such that every number is either a multiple of 2, 3, or 5.
// The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18 is the sequence of ugly numbers with 1 to 10.
// The sequence of ugly numbers with 1 to 10 is: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12.
// Hence, 12 is the 10th ugly number.
//
// The time complexity of the solution is O(n) and the space complexity is O(n).
// The solution is based on the observation that every ugly number is a product of some prime numbers.
// The sequence of ugly numbers is such that every number is either a multiple of 2, 3, or 5.
// The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18 is the sequence of ugly numbers with 1 to 10.
// The sequence of ugly numbers with 1 to 10 is: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12.
// Hence, 12 is the 10th ugly number.
//
// The time complexity of the solution is O(n) and the space complexity is O(n).
// The solution is based on the observation that every ugly number is a product of some prime numbers.
// The sequence of ugly numbers is such that every number is either a multiple of 2, 3, or 5.
// The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18 is the sequence of ugly numbers with 1 to 10.
// The sequence of ugly numbers with 1 to 10 is: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12.
// Hence, 12 is the 10th ugly number.
//
// The time complexity of the solution is O(n) and the space complexity is O(n).
// The solution is based on the observation that every ugly number is a product of some prime numbers.
// The sequence of ugly numbers is such that every number is either a multiple of 2, 3, or 5.
// The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18 is the sequence of ugly numbers with 1 to 10.
// The sequence of ugly numbers with 1 to 10 is: 1, 2, 3, 4, 5, 6, 8,