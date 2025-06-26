class Solution {

    public int lengthOfLIS(int[] nums, int idx, int[] dp) {
        if (dp[idx] != -1) return dp[idx];

        int mx = 1;
        for (int prev = 0; prev < idx; prev++) {
            if (nums[prev] < nums[idx]) {
                mx = Math.max(mx, lengthOfLIS(nums, prev, dp) + 1);
            }
        }
        dp[idx] = mx;
        return mx;
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        int res = 1;
        for (int i = 0; i < n; i++) {
            res = Math.max(res, lengthOfLIS(nums, i, dp));
        }
        return res;
    }
}
