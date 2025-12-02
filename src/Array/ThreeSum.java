package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        for(int i = 0;i<nums.length - 1;i++){
            int target = getTarget(nums[i]);
            List<Integer> twoSums = twoSum(nums, target, i);
            if(twoSums.size() == 2){
                twoSums.add(nums[i]);
                output.add(twoSums);
            }
        }
    return output;
    }

    private int getTarget(int number){
        int target = 0;
        if(number != 0){
            target = -number;
        }
        return target;
    }

    private List<Integer> twoSum(int[] nums, int target, int currentIndex){
        int left = currentIndex + 1;
        int right = nums.length - 1;
        List<Integer> output = new ArrayList<>();
        while(left < right){
            int sum = nums[left] + nums[right];
            if(sum > target){
                right--;
            }else if(sum < target){
                left++;
            }else{
                output.add(nums[left]);
                output.add(nums[right]);
                break;
            }
        }
        return output;
    }
}
