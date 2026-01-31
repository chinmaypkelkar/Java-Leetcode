package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> inputMap = new HashMap<>();
        List<Integer> output = new ArrayList<>();
        for(Integer num : nums){
            inputMap.put(num, inputMap.computeIfAbsent(num, x-> 0) + 1 );
        }

        int appears = nums.length / 3;
        inputMap.forEach((k,v) -> {
            if(v >= appears){
                output.add(k);
            }
        });

        return output;

    }
}
