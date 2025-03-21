class MinStack {
    Stack<Integer> st;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        st = new Stack<>();
        
    }
    
    public void push(int x) {
        if (x <= min) {
            st.push(min);
            min = x;
        }
        st.push(x);
        
    }
    
    public void pop() {// after pop what next min just store that.
        int peek = st.pop();
        if (peek == min){
            min = st.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
        
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