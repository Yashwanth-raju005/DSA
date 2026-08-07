class Solution {
    public void solve(List<String> ans, int n, int open, int close, String str) {
        if (open == n && close == n) {
            ans.add(str);
            return;
        }
        if (open < n) {
            solve(ans, n, open+1, close, str + '(');
        }
        if (open > close) {
            solve(ans, n, open, close+1, str + ')');
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(ans, n, 0, 0, "");
        return ans;
    }
}