class Solution {
    public void dfs(char[][] grid,int r,int c){
        if(r<0|| r>=grid.length|| c<0 || c>= grid[0].length || grid[r][c]=='0'){
            return;
        }
        grid[r][c] = '0';

        dfs(grid,r-1,c);
        dfs(grid,r+1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);






    }
    public int numIslands(char[][] grid) {

        if(grid==null || grid.length==0){
            return 0;

        }

        int cou=0;
        int r=grid.length;
        int c=grid[0].length;

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
            cou++;
            dfs(grid,i,j);
        }

            }
        }
        
       



        return cou;
        
        
    }
}