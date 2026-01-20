class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
        }
        dp[0] = 0;

        for (int a = 1; a <= amount; a++) {
            for (int c = 0; c < coins.length; c++) {
                if (a - coins[c] >= 0) {
                    dp[a] = Math.min(dp[a], dp[a - coins[c]] + 1);
                }
            }
        }

        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}
