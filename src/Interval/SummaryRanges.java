package Interval;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length == 0){
            return List.of();
        }

        var start = nums[0];
        var end = nums[0];
        var temp = new StringBuilder();
        var list = new ArrayList<String>();
        for(var i = 0;i < nums.length - 1;i++){
            if(nums[i] + 1 != nums[i + 1]){
                if(start == end){
                    temp.append(start);
                }else{
                    temp.append(start).append("->").append(end);
                }
                list.add(temp.toString());
                temp.setLength(0);
                start = nums[i + 1];
                end = nums[i + 1];
            }else{
                end = nums[i + 1];
            }
        }
        if(start == end){
            temp.append(start);
        }else{
            temp.append(start).append("->").append(end);
        }
        list.add(temp.toString());
        return list;

    }

}
