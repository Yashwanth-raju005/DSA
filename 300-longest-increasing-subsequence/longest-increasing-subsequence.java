class Solution {

    public static int solve(int idx, int prev_idx, int[] nums, int[][] dp) {
        if (idx == nums.length) {
            return 0;
        }

        if (dp[idx][prev_idx + 1] != -1) {
            return dp[idx][prev_idx+1];
        }

        // not take 

        int nottake = 0 + solve(idx + 1, prev_idx, nums, dp);

        // take , if prev_idx == - 1 that means it doesn't have so take it for sure
        int take = 0;
        if (prev_idx == -1 || nums[idx] > nums[prev_idx]) {
            take = 1 + solve(idx + 1, idx, nums, dp);
        }

        return dp[idx][prev_idx + 1] = Math.max(nottake, take);

    }

    public int lengthOfLIS(int[] nums) {
        int prev_idx = -1;
        int idx = 0;
        int n = nums.length;
        int[][] dp = new int[n + 1][n + 1];
        for (int[] it : dp)
            Arrays.fill(it, -1);
        return solve(idx, prev_idx, nums, dp);
    }
}