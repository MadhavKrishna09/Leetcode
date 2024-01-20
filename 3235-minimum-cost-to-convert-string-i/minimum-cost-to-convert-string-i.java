class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        final long inf = (long) 1e18;
        long ans = 0;
        long[][] c = new long[26][26];

        

        for(int i =0;i<26;i++)
            Arrays.fill(c[i],inf);
        
        for(int i =0;i<26;i++)
                c[i][i] = 0;

        for(int i=0;i<original.length;i++){
            c[original[i] - 'a'][changed[i] -'a'] = Math.min(c[original[i] - 'a'][changed[i] -'a'],(long)cost[i]);
        }

        for(int k=0;k<26;k++){
            for(int i =0;i<26;i++){
                for(int j=0;j<26;j++){
                    c[i][j] = Math.min(c[i][j],c[i][k] + c[k][j]);
                }
            }
        }

        for(int i =0;i<source.length();i++){
            ans += c[source.charAt(i) - 'a'][target.charAt(i) - 'a'];
            if (ans >= inf)
                return -1;
        }

        return ans;

    }
}