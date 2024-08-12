class Solution {
    public int hammingWeight(int n) {
        // StringBuilder st = new StringBuilder();
        int count = 0;
        // if(n==1) return 1;
        while(n!=1){
            int c = n%2;
            if(c == 1) count ++;
            n=n/2;
        }

        return count+1;
        
    }
}