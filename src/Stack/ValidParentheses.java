package Stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> inputStack = new Stack<>();
        List<Character> terminal = new ArrayList<>();
        terminal.add(')');
        terminal.add('}');
        terminal.add(']');

        for(int i = 0 ;i < s.length(); i++){
            if(terminal.contains(s.charAt(i))) {
                if (inputStack.isEmpty()) {
                    return false;
                } else {
                    if ((s.charAt(i) == ')' && inputStack.peek() == '(') ||
                            (s.charAt(i) == '}' && inputStack.peek() == '{') ||
                            (s.charAt(i) == ']' && inputStack.peek() == '[')) {
                        inputStack.pop();
                    } else {
                        return false;
                    }
                }
            }
            else{
                inputStack.push(s.charAt(i));
            }

        }

        return inputStack.isEmpty();
    }
}
