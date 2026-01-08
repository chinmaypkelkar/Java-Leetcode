package Stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] output = new int[temperatures.length];
        Stack<Integer> tempStack = new Stack<>();
        tempStack.push(0);
        for(int i = 1;i < temperatures.length; i++){
                while(!tempStack.isEmpty() && temperatures[tempStack.peek()] < temperatures[i]){
                    int prev = tempStack.pop();
                    output[prev] = i - prev;
                }
                tempStack.push(i);
        }
        return output;
    }
}
