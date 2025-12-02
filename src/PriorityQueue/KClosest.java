package PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class KClosest {
    public int[][] kClosest(int[][] points, int k) {
        TreeMap<Double, List<int[]>> inputMap = new TreeMap<Double, List<int[]>>();
        for(int[] point : points){
            Double distanceFromOrigin = getDistanceFromOrigin(point);
            inputMap.computeIfAbsent(distanceFromOrigin, r -> new ArrayList<int[]>()).add(point);
        }
        int count = 1;
        Double neededKey = null;

        for(Double key : inputMap.keySet()){
            if(count == k){
                neededKey = key;
            }
            count++;
        }

        List<int[]> output = inputMap.get(neededKey);
        return output.toArray(new int[output.size()][]);
        

    }

    private Double getDistanceFromOrigin(int[] point){
        return Math.sqrt((Math.pow(point[0],2) + Math.pow(point[1],2)));
    }

}
