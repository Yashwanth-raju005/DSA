class Solution {

    public void dfs(int r,int c,int[] delrow,int[] delcol,int[][] vis,char[][] board){
        vis[r][c] = 1;
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<4;i++){
            int nrow = r+delrow[i];
            int ncol = c+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && board[nrow][ncol]=='O' && vis[nrow][ncol] == 0){
                dfs(nrow,ncol,delrow,delcol,vis,board);
            }
        }
    }

    public void solve(char[][] board) {
        // dfs
        int n = board.length;
        int m = board[0].length;
        int[][] vis = new int[n][m];
        for(int[] i : vis) Arrays.fill(i,0);

        int[] delrow = {-1,0,+1,0};
        int[] delcol = {0,+1,0,-1};

        // top and last - row 

        for(int i=0;i<m;i++){
            if(board[0][i] == 'O' && vis[0][i] == 0){
                dfs(0,i,delrow,delcol,vis,board);
            }
            
            if(board[n-1][i]=='O' && vis[n-1][i] == 0){
                dfs(n-1,i,delrow,delcol,vis,board);
            }
        }

        // first and last - col

        for(int i=0;i<n;i++){
            if(board[i][0] == 'O' && vis[i][0]==0){
                dfs(i,0,delrow,delcol,vis,board);
            }

            if(board[i][m-1]=='O' && vis[i][m-1]==0){
                dfs(i,m-1,delrow,delcol,vis,board);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j] == 0 && board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

    }
}