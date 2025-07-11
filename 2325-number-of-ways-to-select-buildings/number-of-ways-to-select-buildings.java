class Solution {
    public long numberOfWays(String s) {
        int n = s.length();
        long[] left0 = new long[n];
        long[] left1 = new long[n];
        long[] right1 = new long[n];
        long[] right0 = new long[n];
        left0[0] = s.charAt(0) == '0' ? 1:0;
        left1[0] = s.charAt(0) == '1' ? 1:0;
        right0[n-1] = s.charAt(n-1) == '0' ? 1:0;
        right1[n-1] = s.charAt(n-1) == '1' ? 1:0;
        long answer = 0;



        for(int i = 1;i<n;i++){
            if(s.charAt(i) == '0'){
                left0[i] = left0[i-1] +1;
                left1[i] = left1[i-1];
            }
            else{
                left0[i] = left0[i-1];
                left1[i] = left1[i-1]+1;
            }
        } 
        for(int i = n-2;i>=0;i--){
            if(s.charAt(i) == '0'){
                right0[i] = right0[i+1] +1;
                right1[i] = right1[i+1];
            }
            else{
                right0[i] = right0[i+1];
                right1[i] = right1[i+1]+1;
            }
        } 

        for(int i = 1;i<n-1;i++){
            if(s.charAt(i) == '0'){
                answer += left1[i-1] * right1[i+1];
            }
            else{
                answer+=left0[i-1] * right0[i+1];
            }
        }

        return answer;

    }
}