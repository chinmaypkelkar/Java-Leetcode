package Graph;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int max = Integer.MIN_VALUE;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length;i++){
            for(int j = 0; j< grid[0].length; j++){
                if(grid[i][j] == 1){
                    int area = DFS(i,j,grid,visited);
                    max = Math.max(max, area);
                }
            }

        }
        return max;
    }

    public int DFS(int row, int column, int[][] grid, boolean[][] visited){
        if(row < 0 || row > grid.length || column < 0 || column > grid[0].length ||
                grid[row][column] == 0 || visited[row][column]){
            return 0;
        }
        visited[row][column] = true;
        return 1 + DFS(row + 1, column, grid, visited) + DFS(row - 1, column, grid, visited)
                + DFS(row, column + 1, grid, visited) + DFS(row, column - 1, grid, visited);
    }
}
