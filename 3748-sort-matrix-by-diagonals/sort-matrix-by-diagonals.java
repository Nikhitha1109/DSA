import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;

        // Map from diagonal key (i-j) to list of elements
        Map<Integer, List<Integer>> diagMap = new HashMap<>();

        // Collect elements by diagonal key
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                diagMap.computeIfAbsent(key, k -> new ArrayList<>()).add(grid[i][j]);
            }
        }

        // Sort each diagonal according to rules
        for (int key : diagMap.keySet()) {
            List<Integer> list = diagMap.get(key);
            if (key >= 0) {
                // bottom-left (including main diagonal) → descending
                list.sort(Collections.reverseOrder());
            } else {
                // top-right → ascending
                Collections.sort(list);
            }
        }

        // Place back values
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                int idx = indexMap.getOrDefault(key, 0);
                grid[i][j] = diagMap.get(key).get(idx);
                indexMap.put(key, idx + 1);
            }
        }

        return grid;
    }
}
