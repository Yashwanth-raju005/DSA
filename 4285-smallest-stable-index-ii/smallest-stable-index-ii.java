class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] maxis = new int[n];
        maxis[0] = nums[0];
        for(int i=1;i<n;i++){
            maxis[i] = Math.max(maxis[i-1],nums[i]);
        }
        int[] minis = new int[n];
        minis[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            minis[i] = Math.min(minis[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            if(maxis[i]-minis[i] <= k){
                return i;
            }
        }
        return -1;
    }
}