import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Problem {
    /**
     * Given an array of integers nums and an integer target,
     * find two numbers such that they add up to target and return their indices.
     * You may assume that each input would have exactly one solution,
     * and you may not use the same element twice.
     * You can return the answer in any order.
     *
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     * Example 2:
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     *
     * Example 3:
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     */
  public int[] twoSum(int[] nums, int target){
    Map<Integer, Integer> numMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (numMap.containsKey(complement)) {
        return new int[] { numMap.get(complement), i };
      } else {
        numMap.put(nums[i], i);
      }
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}

public class Main {
  public static void main(String[] args) {
    Problem problem = new Problem();
    int[] nums = {2,7,11,15};
    int target = 9;
    int[] result = problem.twoSum(nums, target);
    System.out.println(Arrays.toString(result));

    nums = new int[] {3,2,4};
    target = 6;
    result = problem.twoSum(nums, target);
    System.out.println(Arrays.toString(result));

    nums = new int[] {3,3};
    target = 6;
    result = problem.twoSum(nums, target);
    System.out.println(Arrays.toString(result));
  }
}


This solution uses a HashMap to store the difference between the target and the current number, and its index. If the difference is already in the map, it means we have found a pair that adds up to the target, and we return the indices of the two numbers. If the difference is not in the map, we add the current number and its index to the map.

The time complexity of this solution is O(n), where n is the length of the input array, because we only iterate through the array once. The space complexity is also O(n), because in the worst case, we might need to store all the numbers in the map.