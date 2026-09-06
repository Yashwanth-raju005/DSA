class Solution {
    public int solve(String s,int p1,String t,int p2,int[][] dp){
        if(p2<0){
            return 1;
        }
        if(p1<0){
            return 0;
        }
        if(dp[p1][p2] != -1){
            return dp[p1][p2];
        }
        if(s.charAt(p1) == t.charAt(p2)){
            return dp[p1][p2]=solve(s,p1-1,t,p2-1,dp) + solve(s,p1-1,t,p2,dp);
        }else{
            return dp[p1][p2]=solve(s,p1-1,t,p2,dp);
        }
    }
    public int numDistinct(String s, String t) {
        int p1 = s.length();
        int p2 = t.length();
        int[][] dp = new int[p1][p2];
        for(int[] i:dp) Arrays.fill(i,-1);
        solve(s,p1-1,t,p2-1,dp);
        return dp[p1-1][p2-1];
    }
}