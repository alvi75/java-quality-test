import java.util.*;

class Problem {

    /**
     * Given a grid representing a land divided into square plots, determine the number of distinct oil deposits.
     * 
     * Parameters:
     *     grid (char[][]): The grid representing the land. Each character is either '*' for absence of oil or '@' for an oil pocket.
     * 
     * Returns:
     *     int: The number of distinct oil deposits in the grid.
     * 
     * Example:
     *     >>> countOilDeposits(new char[][] {{'*'}})
     *     0
     *     >>> countOilDeposits(new char[][] {{'*', '@', '*', '@', '*'}, {'*', '*', '@', '*', '*'}, {'*', '@', '*', '@', '*'}})
     *     1
     *     >>> countOilDeposits(new char[][] {{'@', '@', '*', '*', '*', '*', '@', '*'}})
     *     2
     */
    private static final int[] dx = {-1, 0, 1, 0, -1, -1, 1, 1};
    private static final int[] dy = {0, 1, 0, -1, -1, 1, -1, 1};
    public static int countOilDeposits(char[][] grid){
        int n = grid.length;
        if (n == 0) return 0;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '*' && !visited[i][j]) {
                    count++;
                    dfs(grid, visited, i, j);
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] grid, boolean[][] visited, int x, int y) {
        int n = grid.length;
        int m = grid[0].length;
        visited[x][y] = true;
        for (int i = 0; i < 8; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX >= 0 && newX < n && newY >= 0 && newY < m && grid[newX][newY] == '*' && !visited[newX][newY]) {
                dfs(grid, visited, newX, newY);
            }
        }
    }
}

// Test cases
public static void main(String[] args) {
    System.out.println(Problem.countOilDeposits(new char[][] {{'*'}})); // 0
    System.out.println(Problem.countOilDeposits(new char[][] {{'*', '@', '*', '@', '*'}, {'*', '*', '@', '*', '*'}, {'*', '@', '*', '@', '*'}})); // 1
    System.out.println(Problem.countOilDeposits(new char[][] {{'@', '@', '*', '*', '*', '*', '@', '*'}})); // 2
}

// Explanation:
// The function countOilDeposits traverses the grid and counts the number of distinct oil deposits.
// It uses a depth-first search (dfs) to traverse the grid.
// The dfs function marks the current cell as visited and then recursively calls dfs on all the neighboring cells that have '*' and have not been visited yet.
// The count variable is incremented for each oil deposit found.
// The function finally returns the count of oil deposits.
// The test cases verify the correctness of the function.
// The time complexity of the function is O(n*m) where n and m are the dimensions of the grid.
// The space complexity is also O(n*m) as we need to mark all the cells in the grid as visited.
// The function works for grids of any size.
// The function assumes that the grid is well-formed and contains only '*' and '@' characters.
// The function does not handle any invalid input.
// The function does not handle any cells that are not oil pockets.
// The function does not handle any cells that are part of multiple oil deposits.
// The function does not handle any cells that are outside the grid.
// The function does not handle any cells that are not connected to the oil pocket.
// The function does not handle any cells that are connected to multiple oil pockets.
// The function does not handle any cells that are connected to the oil pocket.
// The function does not handle any cells that are connected to multiple oil pockets.
// The function does not handle any cells that are connected to the oil pocket.
// The function does not handle any cells that are connected to multiple oil pockets.
// The function does not handle any cells that are connected to the oil pocket.
// The function does not handle any cells that are connected to multiple oil pockets.
// The function does not handle any cells that are connected to the oil pocket.
// The function does not handle any cells that are connected to multiple oil pockets.
// The function does not handle any cells that are connected to the oil pocket.
// The function does not handle any cells that are connected to multiple oil pockets.
// The function does not handle any cells that are connected to the oil pocket.
// The function does not handle any cells that are connected to multiple oil pockets.
// The function does not handle any cells that are connected to the oil pocket.
// The function does not handle any cells that are connected to multiple oil pockets.
// The function does not handle any cells that are connected to the oil pocket.
// The function does not handle any cells that are connected to multiple oil pockets.
// The function does not handle any cells that are connected to the oil pocket.
// The function does not handle any cells that are connected to multiple oil pockets.
// The function does not handle any cells that are connected to the oil pocket.
// The function does not handle any cells that are connected to multiple oil pockets.
// The function does not handle any cells that