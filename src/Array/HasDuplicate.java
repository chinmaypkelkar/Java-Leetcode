package Array;

import java.util.HashSet;
import java.util.Set;

public class HasDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for(int num: nums){
            if(hashset.contains(num)){
                return true;
            }
            hashset.add(num);
        }
        return false;
    }
}
