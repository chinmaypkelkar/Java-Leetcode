package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IslandAndTreasure {
    public void islandsAndTreasure(int[][] grid) {
        List<int[]> directions = List.of(new int[]{0,1}, new int[]{0,-1}, new int[]{1,0} , new int[]{-1,0}  );
        Queue<int[]> q= new LinkedList<>();
        for(int i = 0;i< grid.length; i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 0){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(q.isEmpty()){
            return;
        }
        while(!q.isEmpty()){
            int[] current = q.poll();
            int row = current[0];
            int column = current[1];
            for(int[] direction : directions){
                int x  = row + direction[0];
                int y =  column + direction[1];
                if(x < 0 || x >= grid.length
                        || y < 0 || y >= grid[0].length
                        || grid[x][y] != Integer.MAX_VALUE
                ){
                    continue;
                }
                q.add(new int[]{x,y});
                grid[x][y] = grid[row][column] + 1;

            }
        }
    }
}
