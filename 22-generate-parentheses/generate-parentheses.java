class Solution {
    private static class State {
        String current;
        int open;
        int close;
        
        State(String current, int open, int close) {
            this.current = current;
            this.open = open;
            this.close = close;
        }
    }
    public List<String> generateParenthesis(int n) {
        // List<String> list = new ArrayList<String>();
        // backtrack(list, "", 0, 0, n);
        // return list;
        List<String> result = new ArrayList<>();
        Stack<State> stack = new Stack<>();
        stack.push(new State("", 0, 0)); // Initialize with empty string
        
        while (!stack.isEmpty()) {
            State currentState = stack.pop();
            
            // If the string is complete, add to the result
            if (currentState.current.length() == 2 * n) {
                result.add(currentState.current);
                continue;
            }
            
            // Add ')' if valid
            if (currentState.close < currentState.open) {
                stack.push(new State(
                    currentState.current + ")",
                    currentState.open,
                    currentState.close + 1
                ));
            }
            
            // Add '(' if valid
            if (currentState.open < n) {
                stack.push(new State(
                    currentState.current + "(",
                    currentState.open + 1,
                    currentState.close
                ));
            }
        }
        
        return result;

    }

    // public void backtrack(List<String> list, String p, int open, int close, int max){
    //     if(p.length() == 2*max){
    //         list.add(p);
    //         return;
    //     }

    //     if(open<max){
    //         backtrack(list, p+"(",open+1,close, max);
    //     }
    //     if(close<open){
    //         backtrack(list, p+")", open , close+1, max);
    //     }
    // }
}