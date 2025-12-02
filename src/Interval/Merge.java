package Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> output = new ArrayList<>();
        if(intervals.length == 0 || intervals.length == 1){
            return intervals;
        }
        int i = 1;
        output.add(intervals[0]);
        while(i < intervals.length) {
           if(output.get(output.size() - 1)[1] <= intervals[i][0]){
                output.get(intervals.length - 1)[1] = Math.max(output.get(intervals.length - 1)[1], intervals[i][1]);
           }else{
            output.add(intervals[i]);
           }    
        }
        return output.toArray(new int[output.size()][]);
    }
}
    