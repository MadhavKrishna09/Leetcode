class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for(String s : tokens){
            if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
                st.push(s);
            }
            else{
                int n2 = Integer.parseInt(st.pop());
                int n1 = Integer.parseInt(st.pop());
                int n3 = 0;
                if (s.equals("*")) n3 = n1 * n2;
                if (s.equals("-")) n3 = n1 - n2;
                if (s.equals("/")) n3 = n1 / n2;
                if (s.equals("+")) n3 = n1 + n2;
                // int n3 = n1 sign n2;
                st.push(Integer.toString(n3));
            }
        }

        return Integer.parseInt(st.peek());
    }
}