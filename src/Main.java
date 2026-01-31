import Array.EncodeAndDecode;
import Array.SearchMatrix;
import SlidingWindow.MinSubArray;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MinSubArray minSubArray = new MinSubArray();
        minSubArray.minSubArrayLen(10, new int[]{2,1,5,1,5,3});
    }
}