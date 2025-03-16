class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        ans[n-1] = 0;

        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && t[st.peek()] <= t[i]){
                    st.pop();

                }
                    
            if(!st.isEmpty())
                ans[i]=st.peek() - i;

            st.push(i);
                
            }
       
        return ans;
    }
}