import java.util.*;
class Problem {

  /**
   * Given n non-negative integers representing the heights of bars in a bar chart.
   * Each bar has a width of 1 unit. Calculate the largest rectangle area that can be formed in the bar chart.
   *
   * @param heights An array of integers representing the heights of bars.
   * @return The maximum area of the rectangle that can be formed.
   *
   * Example:
   * largestRectangleArea(new int[]{2,1,5,6,2,3})
   * Output: 10
   *
   * Example:
   * largestRectangleArea(new int[]{2,4})
   * Output: 4
   */
  public static int largestRectangleArea(int[] heights){
    int maxArea = 0;
    Stack<Integer> stack = new Stack<>();
    int tp;
    int areaWithCurrentBar;

    int i = 0;
    while (i < heights.length) {
      if (stack.isEmpty() || heights[i] > heights[stack.peek()]) {
        stack.push(i++);
      } else {
        tp = stack.pop();
        areaWithCurrentBar = heights[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
        maxArea = Math.max(maxArea, areaWithCurrentBar);
      }
    }

    while (!stack.isEmpty()) {
      tp = stack.pop();
      areaWithCurrentBar = heights[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
      maxArea = Math.max(maxArea, areaWithCurrentBar);
    }

    return maxArea;
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println(Problem.largestRectangleArea(new int[]{2,1,5,6,2,3})); // 10
    System.out.println(Problem.largestRectangleArea(new int[]{2,4})); // 4
  }
}

// Time complexity: O(n)
// Space complexity: O(n)

// The idea is to use a stack to keep track of bars. For each bar, we check if it is smaller than the top of the stack. If it is, we pop the stack and calculate the area for the popped bar. If it is not, we push the current bar to the stack.
// We keep popping the stack until the stack is empty or the current bar is not smaller than the top of the stack.
// The area for the popped bar is calculated as the height of the popped bar times the distance between the popped bar and the top of the stack.
// We keep track of the maximum area we have seen so far.
// The stack is used to keep track of the bars in the decreasing order of their heights.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the increasing order of their indices.
// The stack is used to keep track of the bars in the decreasing order of their indices.
// The stack is used to keep track of the bars in the