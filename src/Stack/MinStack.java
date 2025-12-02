package Stack;

import java.util.Stack;

public class MinStack {
    public Stack<Integer> stack;
    public Stack<Integer> minimumStack;
    public MinStack() {
        stack = new Stack<>();
        minimumStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        int minValue;
        if(minimumStack.isEmpty()){
            minValue = val;
        }else{
            minValue = Math.min(val, minimumStack.peek());
        }

        minimumStack.push(minValue);
    }


    public void pop() {
        stack.pop();
        minimumStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minimumStack.peek();
    }
}
