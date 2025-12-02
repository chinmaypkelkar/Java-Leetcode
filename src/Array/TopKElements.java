package Array;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

public class TopKElements  {
    public int[] topKFrequent(int[] nums, int k) {

        int[] output = new int[k];
        if(nums.length == 0 || k == 0){
            return output;
        }
        Map<Integer, Integer> inputMap = new HashMap<>();
        for(int num : nums){
            if(!inputMap.containsKey(num)){
                inputMap.put(num,1);
            }else{
                inputMap.put(num, inputMap.get(num) + 1);
            }
        }
     List<Integer> keyList = new ArrayList<>(inputMap.keySet());
        Collections.sort(keyList, (i1,i2) -> Objects.equals(inputMap.get(i1), inputMap.get(i2)) ? i1 - i2 : inputMap.get(i2) - inputMap.get(i1) );

        for(int i = 0; i<k;i++){
            output[i] = keyList.get(i);
        }

        return output;


    }

    public int[] test(int[] nums, int k) {
        Map<Integer, Integer> inputMap = new HashMap<>();
        for(int num : nums){
            inputMap.put(num, inputMap.getOrDefault(num, 0) + 1);

        }

        List<Integer> keySet = new ArrayList<>(inputMap.keySet());
        keySet.sort((a, b) -> Objects.equals(inputMap.get(a), inputMap.get(b)) ? a - b : inputMap.get(a) - inputMap.get(b));
        return keySet.stream().limit(k).mapToInt(Integer::intValue).toArray();
    }


}
