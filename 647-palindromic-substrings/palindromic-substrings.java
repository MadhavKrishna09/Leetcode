class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int odd=0, even = 0;

        for(int i = 0;i<n;i++){
            int l  =i;
            int r = i;
            odd += count(s,l,r);
            even += count(s,l,r+1);
        }

        return odd+even;

    }

    public int count(String s , int l, int r){
        int count = 0;
        while(l>=0&&r<s.length()&&s.charAt(l) == s.charAt(r)){
            count++;
            l--;r++;
        }

        return count;
    }
}