class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][] memo = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            Arrays.fill(memo[i], -1);
        }
        return dp(0, s.length() - 1, s, memo);
    }

    private int dp(int left, int right, String s, int[][] memo) {
        if (left > right) return 0;
        if (left == right) return 1;
        if (memo[left][right] != -1) return memo[left][right];

        if (s.charAt(left) == s.charAt(right)) {
            memo[left][right] = 2 + dp(left + 1, right - 1, s, memo);
        } else {
            memo[left][right] = Math.max(dp(left + 1, right, s, memo), dp(left, right - 1, s, memo));
        }
        return memo[left][right];
    }
}
