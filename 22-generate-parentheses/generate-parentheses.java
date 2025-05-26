class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;

    }

    public void backtrack(List<String> list, String p, int open, int close, int max){
        if(p.length() == 2*max){
            list.add(p);
            return;
        }

        if(open<max){
            backtrack(list, p+"(",open+1,close, max);
        }
        if(close<open){
            backtrack(list, p+")", open , close+1, max);
        }
    }
}