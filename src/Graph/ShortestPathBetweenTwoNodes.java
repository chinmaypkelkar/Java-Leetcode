package Graph;

import java.util.*;

public class ShortestPathBetweenTwoNodes {
    public int getShortestPath(int[][] grid){
        int n = grid.length;
        List<int[]> distanceList = List.of(new int[]{0,-1}, new int[]{-1,-1},
                new int[]{-1,0}, new int[]{-1,1}, new int[]{0,1}, new int[]{1,1}, new int[]{1,1}, new int[]{1,0}, new int[]{1,-1});

        if(grid[0][0] == 1 || grid[n-1][n-1] == 1){
            return -1;
        }

        Deque<int[]> queue = new ArrayDeque<>();
        int[] source = new int[]{0,0,0};
        queue.add(source);
        while(!queue.isEmpty()){
            int[] node = queue.remove();
            int row = node[0];
            int column = node[1];
            int weight = node[2];

            if(row == n-1 && column == n-1){
                return weight;
            }

            for(int[] distance : distanceList){
                row = row + distance[0];
                column = column + distance[1];
                if(row >=0 && row <= n-1 && column >=0 &&  column <=n-1 && grid[row][column] == 0){
                    queue.add(new int[]{row, column,weight+1});
                }
            }
        }
        return -1;


    }
}
