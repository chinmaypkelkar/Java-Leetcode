package SlidingWindow;

public class MinSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int runningTotal = 0;
        int minLength = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right++){
            runningTotal += nums[right];
            while(runningTotal >= target){
                minLength = Math.min(minLength, right - left + 1);
                runningTotal -= nums[left];
                left++;
            }
        }
        return minLength;
    }
}
