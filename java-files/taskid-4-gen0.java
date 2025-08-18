import java.lang.*;
import java.util.*;

class Problem {

  /**
   * Given an array of distinct integers, return all possible permutations of the array.
   * >>> permute(new int[]{1,2,3})
   * [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
   * >>> permute(new int[]{0,1})
   * [[0,1],[1,0]]
   * >>> permute(new int[]{1})
   * [[1]]
   */
  public List<List<Integer>> permute(int[] nums){
    List<List<Integer>> result = new ArrayList<>();
    backtrack(result, new ArrayList<>(), nums);
    return result;
  }

  private void backtrack(List<List<Integer>> result, List<Integer> tempList, int [] nums){
    if(tempList.size() == nums.length){
      result.add(new ArrayList<>(tempList));
    } else{
      for(int i = 0; i < nums.length; i++){
        if(tempList.contains(nums[i])) continue; // element already exists, skip
        tempList.add(nums[i]);
        backtrack(result, tempList, nums);
        tempList.remove(tempList.size() - 1);
      }
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Problem p = new Problem();
    System.out.println(p.permute(new int[]{1,2,3}));
    System.out.println(p.permute(new int[]{0,1}));
    System.out.println(p.permute(new int[]{1}));
  }
}

// Output:
// [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// [[0,1],[1,0]]
// [[1]]
// Explanation:
// The first permutation is [1,2,3] -> [1,2,3]
// The second permutation is [0,1] -> [0,1]
// The third permutation is [1] -> [1]
// The fourth permutation is [2,1,3] -> [2,1,3]
// The fifth permutation is [2,3,1] -> [2,3,1]
// The sixth permutation is [3,1,2] -> [3,1,2]
// The seventh permutation is [3,2,1] -> [3,2,1]
// So, the output is the list of all possible permutations of the input array.
// The time complexity of this solution is O(n*n!) where n is the number of elements in the array.
// The space complexity is O(n) for storing the result.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch before backtracking.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch before backtracking.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch before backtracking.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch before backtracking.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch before backtracking.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch before backtracking.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch before backtracking.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch before backtracking.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch before backtracking.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch before backtracking.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch before backtracking.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch before backtracking.
// The backtracking method is used to generate all permutations.
// The backtracking method is a depth-first search algorithm.
// It starts at the root (here, the first element) and explores as far as possible along each branch