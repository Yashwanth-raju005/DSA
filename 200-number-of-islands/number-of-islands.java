class Solution {

    public static void dfs(int row,int col,int[][] vis,char[][] grid){
        vis[row][col] = 1;

        int[] delrow = {-1,0,+1,0};
        int[] delcol = {0,+1,0,-1};

        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<4;i++){
            int newrow = row + delrow[i];
            int newcol = col + delcol[i];

            if(newrow>=0 && newrow<n && newcol>=0 && newcol<m && grid[newrow][newcol]=='1' && vis[newrow][newcol]==0){
                dfs(newrow,newcol,vis,grid);
            }
        }

    }

    public int numIslands(char[][] grid) {
        // lets try using dfs
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        int[][] vis = new int[n][m];

        for(int row=0;row<n;row++){
            for(int col=0;col<m;col++){
                if(grid[row][col] == '1' && vis[row][col] == 0){
                    dfs(row,col,vis,grid);
                    cnt++;
                }
            }
        }

        return cnt;

    }
}