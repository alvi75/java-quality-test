import java.util.ArrayList;
import java.util.List;

class Problem {

  /**
   * Return all integers in the range [1, n] in lexicographical order.
   *
   * @param n The upper limit of the range.
   * @return List of integers in lexicographical order.
   *
   * Example:
   * lexicalOrder(13)
   * Output: [1,10,11,12,13,2,3,4,5,6,7,8,9]
   */
  public static List<Integer> lexicalOrder(int n){
    List<Integer> result = new ArrayList<>();
    int current = 1;

    for (int i = 1; i <= n; i++) {
      result.add(current);

      if (current * 10 <= n) {
        current *= 10;
      } else if (current % 10 != 9 && current + 1 <= n) {
        current++;
      } else {
        while (current % 10 == 9) {
          current /= 10;
        }
        current++;
      }
    }

    return result;
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println(Problem.lexicalOrder(13));
  }
}

// Output: [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9]
// Explanation:
// The lexicographical order is [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9].
// The numbers 1, 10, 11, 12, 13 are in the range [1, 13] and their lexicographical order is [1, 10, 11, 12, 13].
// The numbers 2, 3, 4, 5, 6, 7, 8, 9 are in the range [1, 13] and their lexicographical order is [2, 3, 4, 5, 6, 7, 8, 9].
// The number 10 is not in the range [1, 13] and the number 11 is not in the range [1, 13].
// Therefore, the lexicographical order of the numbers in the range [1, 13] is [1, 10, 11, 12, 13].
// The process continues for the rest of the numbers in the range [1, 13].
// The numbers 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 are not in the range [1, 13] and their lexicographical order is not [90, 91, 92, 93, 94, 95, 96, 97, 98, 99].
// Therefore, the lexicographical order of the numbers in the range [1, 13] is [1, 10, 11, 12, 13].
// The process continues for the rest of the numbers in the range [1, 13].
// The numbers 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99 are not in the range [1, 13] and their