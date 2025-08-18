import java.util.ArrayList;
import java.util.List;

class Problem {

  /**
   * Find all stepping numbers in the range [low, high] where a stepping number is defined as a number where each digit is either one more or one less than the adjacent digit.
   *
   * @param low The lower bound of the range.
   * @param high The upper bound of the range.
   * @return A list of stepping numbers within the range [low, high] sorted in ascending order.
   *
   * Example:
   * findSteppingNumbers(0, 21)
   * Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 21]
   */
  public static List<Integer> findSteppingNumbers(int low, int high){
    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      dfs(low, high, i, result);
    }
    return result;
  }

  private static void dfs(int low, int high, int num, List<Integer> result) {
    if (num >= low && num <= high) {
      result.add(num);
    }
    if (num == 0 || num > high) {
      return;
    }
    int lastDigit = num % 10;
    int nextNum = num * 10 + (lastDigit - 1);
    if (nextNum >= low && nextNum <= high) {
      dfs(low, high, nextNum, result);
    }
    nextNum = num * 10 + (lastDigit + 1);
    if (nextNum >= low && nextNum <= high) {
      dfs(low, high, nextNum, result);
    }
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println(Problem.findSteppingNumbers(0, 21));
  }
}

// Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 21]
// Explanation: The stepping numbers in the range [0, 21] are: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 21.
// The numbers 11, 13, 14, 15, 16, 17, 18, 19, 20, 21 are not in the range.
// The numbers 12, 21 are not in the range.
// The numbers 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 are not in the range.
// The numbers 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 are not in the range.
// The numbers 10, 20, 30, 40, 50, 60, 70, 80, 90 are not in the range.
// The numbers 11, 22, 33, 44, 55, 66, 77, 88, 99 are not in the range.
// The numbers 101, 202, 303, 404, 505, 606, 707, 808, 909 are not in the range.
// The numbers 111, 222, 333, 444, 555, 666, 777, 888, 999 are not in the range.
// The numbers 1001, 2002, 3003, 4004, 5005, 6006, 7007, 8008, 9009 are not in the range.
// The numbers 1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999 are not in the range.
// The numbers 10001, 20002, 30003, 40004, 50005, 60006, 70007, 80008, 90009 are not in the range.
// The numbers 11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999 are not in the range.
// The numbers 100001, 200002, 300003, 400004, 500005, 600006, 700007, 800008, 900009 are not in the range.
// The numbers 111111, 222222, 333333, 444444, 555555, 666666, 777777, 888888, 999999 are not in the range.
// The numbers 1000001, 2000002, 3000003, 4000004, 5000005, 6000006, 7000007, 8000008, 9000009 are not in the range.
// The numbers 1111111, 2222222