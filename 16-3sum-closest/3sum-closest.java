class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int resultSum = nums[0] + nums[1] + nums[2];
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int second = nums[l];
                int third = nums[r];
                int sum = first + second + third;

                if (sum == target) {
                    return target;
                } else if (target > sum) {
                    l++;
                } else {
                    r--;
                }

                if (Math.abs(sum - target) < minDiff) {
                    resultSum = sum;
                    minDiff = Math.min(minDiff, Math.abs(sum - target));
                }

            }
        }

        return resultSum;

    }
}