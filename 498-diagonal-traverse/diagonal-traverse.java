import java.util.*;
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int index = 0;
        for (int d = 0; d < m + n - 1; d++) {
            List<Integer> temp = new ArrayList<>();
            int rowStart = Math.max(0, d - (n - 1));
            int rowEnd   = Math.min(m - 1, d);
            for (int r = rowStart; r <= rowEnd; r++) {
                int c = d - r;
                temp.add(mat[r][c]);
            }
            if (d % 2 == 0) Collections.reverse(temp);

            for (int val : temp) {
                result[index++] = val;
            }
        }
        return result;
    }
}
