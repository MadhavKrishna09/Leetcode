class Solution {
    public int minimumLength(String s) {
        // int i=0;
        // int j=s.length()-1;

        // while(i<j){
        //     if(s.charAt(i) == s.charAt(j)){
        //         while(s.charAt(i) == s.charAt(i+1) & i+1<j){
        //             i++;
        //         }
        //         i++;
        //         while(s.charAt(j) == s.charAt(j-1) & j-1>i){
        //             j--;
        //         }
        //         j--;
                
        //     }
        //     else break;
        // }
        //  return j-i+1;
        char[] ch = s.toCharArray();
        int n = ch.length;
        int i=0;
        int j=n-1;
        while(j>i){
            if(ch[i]!=ch[j]) break;
            char c = ch[i];
            while(j>=i && ch[i]==c)i++;
            while(j>=i && ch[j]==c)j--;
        }
        return j-i+1;
    }
}