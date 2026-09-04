class Solution {
    public int getMax(int n,int[] nums){
        int max=nums[n];
        for(int i=0;i<=n;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public int getMin(int n,int[] nums){
        int min=nums[n];
        for(int i=n;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        return min;
    }
    public int firstStableIndex(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int max_val = getMax(i,nums);
            int min_val = getMin(i,nums);
            if((max_val - min_val) <= k && (max_val - min_val) < ans){
                ans=Math.min(i,ans);
            }
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}