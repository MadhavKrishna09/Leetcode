class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans  = new int[n];
        Stack<int[]> st = new Stack<>();
        st.push(new int[]{temperatures[0], 0});
        for(int i = 1;i<n;i++){
            if(st.peek()[0]>= temperatures[i]){
                st.push(new int[]{temperatures[i], i});
            }
            else{
                while(!st.isEmpty() && st.peek()[0]< temperatures[i]){
                    int[] t = st.pop();
                    ans[t[1]] = i-t[1];          
                }
                st.push(new int[]{temperatures[i], i});
            }
        }

        while(!st.isEmpty()){
            int[] t= st.pop();
            ans[t[1]] = 0;

        }
        
        
        return ans;
    }
}
