import java.util.ArrayList;

class Problem {

  /**
   * Return all elements in the matrix in diagonal order.
   *
   * @param mat The input matrix.
   * @return An array containing all elements in diagonal order.
   *
   * Example:
   * diagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}})
   * Output: [1,2,4,7,5,3,6,8,9]
   */
  public static int[] diagonalOrder(int[][] mat){
    if (mat.length == 0) return new int[0];

    int m = mat.length, n = mat[0].length;
    int size = m * n;
    int[] res = new int[size];
    int index = 0;

    for (int k = 0; k < m; k++) {
      for (int l = 0; l < n; l++) {
        res[index++] = mat[k][l];
      }
    }

    return res;
  }

  public static void main(String[] args) {
    int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
    int[] res = diagonalOrder(mat);
    for (int i : res) {
      System.out.print(i + " ");
    }
  }
}


This solution works by iterating over the matrix and adding each element to the result array in its diagonal order. The time complexity is O(m*n) and the space complexity is O(m*n).