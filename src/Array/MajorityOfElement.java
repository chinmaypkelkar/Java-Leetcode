package Array;

import java.util.Arrays;

public class MajorityOfElement {

 public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int halfOfLength = nums.length / 2;
        int i = 1;
        int count = 1;
        int element = -1;
        while(i < nums.length){
            if(nums[i] != nums[i-1]){
                if(count > halfOfLength){
                    element = nums[i-1];
                    break;
                }else{
                    count = 1;
                }
            }else{
                count++;
            }
            i++;
        }
         if(count > halfOfLength){
            element = nums[i-1];
         }
        return element;
        
    }
}
