class Problem {

  /**
   * Given a binary matrix mat of size m x n, return the length of the longest continuous line of 1s in the matrix.
   * The line could be horizontal, vertical, diagonal, or anti-diagonal.
   *
   * @param mat The binary matrix.
   * @return The length of the longest continuous line of 1s.
   *
   * Example:
   * longestLine(new int[][]{{0,1,1,0},{0,1,1,0},{0,0,0,1}})
   * Output: 3
   */
  public static int longestLine(int[][] mat){
    if (mat.length == 0) return 0;

    int m = mat.length, n = mat[0].length;
    int[][] horizontal = new int[m][n];
    int[][] vertical = new int[m][n];
    int[][] diagonal = new int[m][n];
    int[][] antiDiagonal = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i > 0 && j > 0) diagonal[i][j] = Math.min(diagonal[i-1][j-1], Math.min(horizontal[i][j], vertical[i][j])) + 1;
        if (i > 0) horizontal[i][j] = Math.max(horizontal[i-1][j], vertical[i][j]);
        if (j > 0) vertical[i][j] = Math.max(vertical[i][j-1], diagonal[i][j]);
        if (i > 0 && j > 0) antiDiagonal[i][j] = Math.min(diagonal[i-1][j-1], Math.min(horizontal[i][j], vertical[i][j])) + 1;
      }
    }

    int max = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        max = Math.max(max, diagonal[i][j]);
      }
    }

    return max;
  }
}


This problem is a dynamic programming problem. The idea is to maintain four arrays: `horizontal`, `vertical`, `diagonal`, and `antiDiagonal`. Each array stores the length of the longest line ending at each cell.

The `horizontal` array stores the length of the longest line ending at each cell in the same row.

The `vertical` array stores the length of the longest line ending at each cell in the same column.

The `diagonal` array stores the length of the longest line ending at each cell in the same diagonal.

The `antiDiagonal` array stores the length of the longest line ending at each cell in the same anti-diagonal.

The time complexity of this solution is O(m*n), where m and n are the number of rows and columns in the matrix, respectively.

The space complexity of this solution is also O(m*n), as we need to store the four arrays.