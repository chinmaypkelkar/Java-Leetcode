package Stack;

import BinaryTree.Node;

import java.util.*;

public class CalPoints {


    public int GetCalPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int output = 0;
        for(String s : operations){
            if(s.equals("+")){
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                int result = operand1 + operand2;
                stack.push(operand2);
                stack.push(operand1);
                stack.push(result);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("D")){
                int result = stack.peek() * 2;
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }

        while(!stack.isEmpty()){
            output = output + stack.pop();
        }

        return output;

    }


}
