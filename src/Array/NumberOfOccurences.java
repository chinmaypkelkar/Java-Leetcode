package Array;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurences {
    public boolean isUniqueNumberOfOccurences(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num, map.get(num) + 1);
            }
        }

        int existValue = 0;
        for(Integer num : map.values()){
            if(num == existValue){
                return false;
            }
            existValue = num;
        }

        return true;
    }
}
