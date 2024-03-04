class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int cnt =0;
        int max = 0;
        Arrays.sort(tokens);
        int i =0, j =tokens.length-1;

        while(i<=j){
            if(power>= tokens[i]){
                power -= tokens[i];
                cnt++;
                max = Math.max(cnt,max);
                i++;
            }else if(cnt>0){
                power += tokens[j];
                cnt--;
                // max = Math.max(cnt,max);
                j--;

            }else break;
        }
    return max;
    }
}