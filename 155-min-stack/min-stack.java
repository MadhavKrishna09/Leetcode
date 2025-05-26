class MinStack {
    Stack<int[]> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()) st.push(new int[]{val, val});
        else{
            int[] t = st.peek();
            int m = t[1];
            if(m>val){
                st.push(new int[]{val, val});
            }
            else{
                st.push(new int[]{val, m});
            }
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        int[] t= st.peek();
        return t[0];
    }
    
    public int getMin() {
        int[] t= st.peek();
        return t[1];
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