package Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class OrangesRotting {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList();
        int totalTime = 0;
        List<int[]> directions = List.of(new int[]{0,1},
                new int[]{0,-1}, new int[]{1,0} , new int[]{-1,0}  );
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j< grid[0].length;j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()){
            int[] currentRottenFruit = q.poll();
            for(int[] direction : directions){
                int nextX = currentRottenFruit[0] + direction[0];
                int nextY = currentRottenFruit[1] + direction[1];
                if(nextX < 0 || nextX >= grid.length
                        || nextY < 0 || nextY >= grid[0].length || grid[nextX][nextY] == 2 ||
                        grid[nextX][nextY] == 0){
                    continue;
                }
                grid[nextX][nextY] = 2;
                q.add(new int[]{nextX, nextY});
            }
            totalTime++;
        }

        return totalTime;
    }
}
