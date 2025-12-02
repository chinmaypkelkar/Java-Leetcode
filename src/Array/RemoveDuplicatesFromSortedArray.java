package Array;

import java.util.List;

//1,1,1,2,2,3,4,4,5,5,5
public class RemoveDuplicatesFromSortedArray {
    public int[] removeDuplicatesFromSortedArray(int[] input){
        if(input.length < 2){
            return input;
        }

        int pointer = 1;
        for(int i = 1;i < input.length; i++){
            if(input[i] != input[i-1]){
                input[pointer] = input[i];
                pointer++;
            }
        }
        while(pointer < input.length){
            input[pointer++] = -1;

        }
        return input;
    }


}
