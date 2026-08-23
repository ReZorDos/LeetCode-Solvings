package need_to_refact.medium._155_Min_Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {

    private List<Integer> list;
    private Stack<Integer> minStack;

    public MinStack() {
        this.list = new ArrayList<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        list.add(val);
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (list.get(list.size()).equals(minStack.peek())) {
            minStack.pop();
        }
        list.remove(list.size() - 1);

    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */