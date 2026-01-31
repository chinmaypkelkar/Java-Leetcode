package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class FindKClosest {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length - 1;
        List<Integer> output = new ArrayList<>();
        while((end - start) >= k){
            int startDistance = Math.abs(arr[start] - x);
            int endDistance = Math.abs(arr[end] - x);
            if(startDistance > endDistance){
                start++;
            }else if(startDistance < endDistance){
                end--;
            }else{
                if(arr[start] < arr[end]){
                    end--;
                }else{
                    start++;
                }
            }
        }

        while(start <= end){
            output.add(arr[start++]);
        }
        return output;

    }
}
