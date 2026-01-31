package Array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int num:nums){
            hashSet.add(num);
        }
        int longestConsecutiveSequence = 0;
        for(int num : nums){

            if(!hashSet.contains(num - 1)){
                int currentSequenceLength = 0;
                while(hashSet.contains(num)){
                    currentSequenceLength++;
                    num = num + 1;
                }
                longestConsecutiveSequence = Math.max(currentSequenceLength, longestConsecutiveSequence);
            }
        }
        return longestConsecutiveSequence;
    }
}
