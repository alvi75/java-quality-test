import java.lang.*;
import java.util.*;

class Problem {
    /**
     * Given an integer array arr, calculate the mean of the remaining elements after removing the smallest 5% and largest 5% of the elements.
     * Return the mean with an error within 10^-5.
     *
     * Example 1:
     * Input: arr = [1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3]
     * Output: 2.00000
     *
     * Example 2:
     * Input: arr = [6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0]
     * Output: 4.00000
     *
     * Example 3:
     * Input: arr = [6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4]
     * Output: 4.77778
     *
     * Example 4:
     * Input: arr = [9,7,8,7,7,8,4,4,6,8,8,7,6,8,8,9,2,6,0,0,1,10,8,6,3,3,5,1,10,9,0,7,10,0,10,4,1,10,6,9,3,6,0,0,2,7,0,6,7,2,9,7,7,3,0,1,6,1,10,3]
     * Output: 5.27778
     *
     * Example 5:
     * Input: arr = [4,8,4,10,0,7,1,3,7,8,8,3,4,1,6,2,1,1,8,0,9,8,0,3,9,10,3,10,1,10,7,3,2,1,4,9,10,7,6,4,0,8,5,1,2,1,6,2,5,0,7,10,9,10,3,7,10,5,8,5,7,6,7,6,10,9,5,10,5,5,7,2,10,7,7,8,2,0,1,1]
     * Output: 5.29167
     */
  public double trimMean(int[] arr){
    Arrays.sort(arr);
    int n = arr.length;
    int fivePercent = (int)Math.round(n * 0.05);
    double sum = 0;
    for(int i = fivePercent; i < n - fivePercent; i++) {
      sum += arr[i];
    }
    return sum / (n - 2 * fivePercent);
  }
}

public class Main {
  public static void main(String[] args) {
    Problem p = new Problem();
    System.out.println(p.trimMean(new int[]{1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3}));
    System.out.println(p.trimMean(new int[]{6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0}));
    System.out.println(p.trimMean(new int[]{6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4}));
    System.out.println(p.trimMean(new int[]{9,7,8,7,7,8,4,4,6,8,8,7,6,8,8,9,2,6,0,0,1,10,8,6,3,3,5,1,10,9,0,7,10,0,10,4,1,10,6,9,3,6,0,0,2,7,0,6,7,2,9,7,7,3,0,1,6,1,10,3}));
    System.out.println(p.trimMean(new int[]{4,8,4,10,0,7,1,3,7,8,8,3,4,1,6,2,1,1,8,0,9,8,0,3,9,10,3,10,1,10,7,3,2,1,4,9,10,7,6,4,0,8,5,1,2,1,6,2,5,0,7,10,9,10,3,7,10,5,8,5,7,6,7,6,10,9,5,10,5,5,7,2,10,7,7,8,2,0,1,1}));
  }
}

// 1. 对数组进行排序。
// 2. 计算5%的元素数量。
// 3. 从排序后的数组中计算剩余元素的平均值。
// 4. 返回结果。
// 注意：由于我们需要返回一个double值，所以我们需要将结果四舍五入到10^-5。
// 此外，由于我们需要计算平均值，所以我们需要从总和中减去2倍的5%的最小