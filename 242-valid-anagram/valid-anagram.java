class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[27];
        for(char c: s.toCharArray()){
            int i = c-'a';
            arr[i]++;

        }
        for(char c: t.toCharArray()){
            int i = c-'a';
            arr[i]--;
            
        }

        for(int n:arr){
            if(n!=0) return false;
            
        }
        return true;

    }
}