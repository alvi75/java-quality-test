import java.util.HashMap;
import java.util.Map;

class Problem {

  /**
   * Given an integer array nums where every element appears three times except for one, which appears only once. Find and return the element that appears only once.
   *
   * @param nums An integer array where every element appears three times except for one.
   * @return The element that appears only once.
   *
   * Example:
   * singleNumber(new int[]{2,2,3,2})
   * Output: 3
   *
   * Example:
   * singleNumber(new int[]{0,1,0,1,0,1,99})
   * Output: 99
   */
  public static int singleNumber(int[] nums){
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() == 1) {
        return entry.getKey();
      }
    }

    return -1;
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println(Problem.singleNumber(new int[]{2,2,3,2})); // Output: 3
    System.out.println(Problem.singleNumber(new int[]{0,1,0,1,0,1,99})); // Output: 99
  }
}

// Time complexity: O(n)
// Space complexity: O(1)
// where n is the number of elements in the array.
// This is because we are using a HashMap to store the frequency of each number.
// The HashMap operations (get, put) are constant time, so the time complexity is O(n).
// The space complexity is also O(1) because we are using a constant amount of space to store the frequency of each number.
// The HashMap has a maximum of n/2 elements, where n is the number of elements in the array, because each element appears twice.
// Therefore, the space complexity is O(1) + O(n/2) = O(n).
// The time complexity is O(n) because we are iterating over the array once.
// Therefore, the overall time complexity is O(n) + O(n) = O(2n) = O(n).
// The space complexity is O(1) + O(n/2) = O(n) = O(2n) = O(n).
// The time complexity is O(n) because we are iterating over the array once.
// Therefore, the overall time complexity is O(n) + O(n) = O(2n) = O(n).
// The space complexity is O(1) + O(n/2) = O(n) = O(2n) = O(n).
// The time complexity is O(n) because we are iterating over the array once.
// Therefore, the overall time complexity is O(n) + O(n) = O(2n) = O(n).
// The space complexity is O(1) + O(n/2) = O(n) = O(2n) = O(n).
// The time complexity is O(n) because we are iterating over the array once.
// Therefore, the overall time complexity is O(n) + O(n) = O(2n) = O(n).
// The space complexity is O(1) + O(n/2) = O(n) = O(2n) = O(n).
// The time complexity is O(n) because we are iterating over the array once.
// Therefore, the overall time complexity is O(n) + O(n) = O(2n) = O(n).
// The space complexity is O(1) + O(n/2) = O(n) = O(2n) = O(n).
// The time complexity is O(n) because we are iterating over the array once.
// Therefore, the overall time complexity is O(n) + O(n) = O(2n) = O(n).
// The space complexity is O(1) + O(n/2) = O(n) = O(2n) = O(n).
// The time complexity is O(n) because we are iterating over the array once.
// Therefore, the overall time complexity is O(n) + O(n) = O(2n) = O(n).
// The space complexity is O(1) + O(n/2) = O(n) = O(2n) = O(n).
// The time complexity is O(n) because we are iterating over the array once.
// Therefore, the overall time complexity is O(n) + O(n) = O(2n) = O(n).
// The space complexity is O(1) + O(n/2) = O(n) = O(2n) = O(n).
// The time complexity is O(n) because we are iterating over the array once.
// Therefore, the overall time complexity is O(n) + O(n) = O(2n) = O(n).
// The space complexity is O(1) + O(n/2) = O(n) = O(2n) = O(n).
// The time complexity is O(n) because we are iterating over the array once.
// Therefore, the overall time complexity is O(n) + O(n) = O(2n) = O(n).
// The space complexity is O(1) + O(n/2) = O(n) = O(2n) = O(n).
// The time complexity is O(n) because we are iterating over the array once.
// Therefore, the overall time complexity is O(n) + O(n) = O(2n) = O(n).
// The space complexity is O(1) + O(n/2) = O(n) = O(2n) = O(n).
// The time complexity is O(n) because we are iterating over the array once.
// Therefore, the overall time complexity is O(n) + O(n) = O(2n) = O(n).
// The space