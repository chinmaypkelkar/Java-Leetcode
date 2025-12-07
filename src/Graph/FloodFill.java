package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        queue.add(new int []{sr,sc});
        int nRows = image.length;
        int nColumns = image[0].length;
        int startPixelColor = image[sr][sc];
        if(startPixelColor == color){
            return image;
        }
        while(!queue.isEmpty()){
            int[] currentCellLocation = queue.poll();
            image[currentCellLocation[0]] [currentCellLocation[1]] = color;
            for(int[] direction : directions){
                int nextRow = currentCellLocation[0] + direction[0];
                int nextColumn = currentCellLocation[1] + direction[1];
                if(nextRow < 0 || nextRow >= nRows || nextColumn < 0 || nextColumn >= nColumns || image[nextRow][nextColumn] != startPixelColor ){
                    continue;
                }
                queue.add(new int[] {nextRow, nextColumn});
            }
        }
        return image;
    }
}
