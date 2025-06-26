import java.util.*;

class Solution {

    public int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        Solution sol = new Solution();

        for (int i = 0; i < T; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String s1 = parts[0];
            String s2 = parts[1];
            System.out.println(sol.longestCommonSubsequence(s1, s2));
        }

        sc.close();
    }
}
