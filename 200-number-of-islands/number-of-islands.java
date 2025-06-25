class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = new int[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && visited[i][j] == 0) {
                    dfs(i, j, visited, grid);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int row, int col, int[][] visited, char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        if (row < 0 || col < 0 || row >= m || col >= n ||
            visited[row][col] == 1 || grid[row][col] == '0') {
            return;
        }

        visited[row][col] = 1;

        dfs(row + 1, col, visited, grid);
        dfs(row - 1, col, visited, grid);
        dfs(row, col + 1, visited, grid);
        dfs(row, col - 1, visited, grid);
    }
}
