package Array;

import java.util.*;

public class AddOneToArray {
    public int[] AddOneToArray(int[] input){
        int size = input.length;
        int carry = 0;
        for(int i = size -1; i >= 0 ; i--){
            int sum = input[i] + 1 ;
            if(sum > 10){
                carry = sum / 10;
                sum = sum % 10;
            }
            input[i] = sum;
        }

        if(carry != 0){
            Set<Integer> hashset = new HashSet<>();
        }

        return null;
    }
}
