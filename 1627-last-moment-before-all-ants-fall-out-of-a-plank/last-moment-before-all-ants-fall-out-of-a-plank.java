class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxL = Arrays.stream(left).max().orElse(0);
        int maxR = n-Arrays.stream(right).min().orElse(n);

        return Math.max(maxL,maxR);
        
    }
}