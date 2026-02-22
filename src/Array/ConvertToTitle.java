package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ConvertToTitle {

    public String convertToTitle(int columnNumber) {
        Map<Integer,String> inputMap = new HashMap<>();
        Stack<Integer> inputStack = new Stack<>();
        StringBuilder output = new StringBuilder();
        for (int i=1;i<=26;i++){
            inputMap.put(i, String.valueOf((char)('A' + i -1)));
        }


        while(columnNumber > 0){
            int remainder = columnNumber % 26;
            inputStack.push(remainder);
            columnNumber = columnNumber / 26;
        }

        while(!inputStack.isEmpty()){
            output.append(inputMap.get(inputStack.pop()));
        }

        return output.toString();


    }
}
