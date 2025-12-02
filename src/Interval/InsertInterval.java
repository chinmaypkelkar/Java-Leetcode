package Interval;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> output = new ArrayList<>();
        int i = 0;

        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            output.add(intervals[i++]);
        }

        while(i < intervals.length && newInterval[0] <= intervals[i][1] && newInterval[1] >= intervals[i][0]){ // overlap
            int min = Math.min(newInterval[0],intervals[i][0]);
            int max = Math.max(newInterval[1],intervals[i][1]);
            newInterval[0] = min;
            newInterval[1] = max;
            i++;
        }

        output.add(newInterval);

        while(i < intervals.length){
            output.add(intervals[i++]);
        }
        return output.toArray(new int[output.size()][]);
    }
}
