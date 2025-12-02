package Array;

import java.util.Arrays;

public class LargestNumber {

     public String largestNumber(int[] nums) {

        String[] inpuStrings = new String[nums.length];
        for(int i = 0;i<nums.length;i++){
            inpuStrings[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(inpuStrings, (a,b) -> (b + a).compareTo(a + b));
         // Handle the case where the largest number is zero
        if (inpuStrings[0].equals("0")) {
            return "0";
        }

        // Concatenate sorted strings to form the largest number
        StringBuilder largestNum = new StringBuilder();
        for (String numStr : inpuStrings) {
            largestNum.append(numStr);
        }



        String test =  largestNum.toString();
        return test;

        
    }
    
}
