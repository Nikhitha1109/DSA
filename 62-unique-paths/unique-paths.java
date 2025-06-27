import java.util.Arrays;

class Solution {
    public static int findpath(int i, int j, int m, int n, int[][] arr) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (i >= m || j >= n) {
            return 0;
        }
        if (arr[i][j] != -1) {
            return arr[i][j];
        }
        arr[i][j] = findpath(i + 1, j, m, n, arr) + findpath(i, j + 1, m, n, arr);
        return arr[i][j];
    }

    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(arr[i], -1);
        }
        return findpath(0, 0, m, n, arr);
    }
}
