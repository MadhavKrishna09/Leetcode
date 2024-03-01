class Solution {
    public int maxJump(int[] stones) {
        int p = stones[1] - stones[0];
        for(int i=2;i<stones.length;i++){
            int p1 = stones[i] - stones[i-2];
            p = Math.max(p,p1);
        }
        return p;
    }
}