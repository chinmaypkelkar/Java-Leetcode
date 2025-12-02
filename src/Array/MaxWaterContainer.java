package Array;

public class MaxWaterContainer {
    public int MaxArea(int[] heights) {
        int area = Integer.MIN_VALUE;
        int leftPointer = 0;
        int rightPointer = heights.length - 1;

        while(leftPointer < rightPointer){
            int minHeight = Math.min(heights[leftPointer],heights[rightPointer]);
            int currentArea = minHeight * (rightPointer - leftPointer);
            area = Math.max(area, currentArea);
            if(heights[leftPointer] < heights[rightPointer]){
                leftPointer++;
            }else{
                rightPointer--;
            }

        }
        return area;

    }
}
