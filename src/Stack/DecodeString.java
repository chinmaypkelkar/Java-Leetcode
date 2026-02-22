package Stack;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {

        Stack<Character> inputStack = new Stack<>();

        for(int i = 0; i< s.length();i++){
            if(s.charAt(i) == ']'){
                StringBuilder builder = new StringBuilder();
                while(inputStack.peek() != '['){
                     builder.append(inputStack.pop());
                }
                inputStack.pop();
                int num = inputStack.pop();
                while(num > 0){
                    inputStack.push(builder.toString().toCharArray())
                }
            }else{
                inputStack.push(s.charAt(i));
            }

        }

    }
}
