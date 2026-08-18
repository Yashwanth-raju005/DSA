class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int l = 0;
        int r = 0;

        while (r < n - 1) {
            int fartest = 0;

            for (int i = l; i <= r; i++) {
                fartest = Math.max(fartest, i + nums[i]);
            }

            l = r + 1;
            r = fartest;
            jumps += 1;

        }

        return jumps;

    }
}