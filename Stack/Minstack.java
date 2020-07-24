class MinStack {
    Stack<Integer> stk = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        stk.push(x);
        if(minStack.isEmpty()){
            minStack.push(x);
        }else{
            if(x <= minStack.peek()){
                minStack.push(x);
            }
        }
    }
    
    public void pop() {
        int top = stk.peek();
        if(!stk.isEmpty()) stk.pop();
        if(top == minStack.peek()) minStack.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
