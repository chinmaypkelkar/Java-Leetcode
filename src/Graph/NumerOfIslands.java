package Graph;

public class NumerOfIslands {

    public int numIslands(char[][] grid) {

        int numOfIslands = 0;
        int nRows = grid.length;
        int nColumns = grid[0].length;
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    numOfIslands++;
                    dfs(grid, i, j,nRows, nColumns );
                }
            }
        }

        return numOfIslands;
    }

    private void dfs(char[][] grid, int i, int j, int nRows, int nColumns){
            if(i >= nRows || i < 0 || j >= nColumns || j < 0 || grid[i][j] == '0'){
                return;
            }
            grid[i][j] = '0';
            dfs(grid, i+1, j,nRows, nColumns );
            dfs(grid, i-1, j,nRows, nColumns );
            dfs(grid, i, j+1,nRows, nColumns );
            dfs(grid, i, j-1,nRows, nColumns );
    }

}
