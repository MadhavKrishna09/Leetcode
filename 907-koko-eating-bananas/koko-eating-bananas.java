class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        // Collections.max(Arrays.asList(numbers));
        if(h == piles.length) return max;
        // Arrays.sort(piles);
        int low = 1;
        // int t = 0;
        // int mid = 
        while(low<max){
            int mid = (low+max)/2;
            int t = timeToEat(mid, piles);
            // if(t==h) return mid;
            if(t<=h){
                max = mid;
            }
            else{
                low = mid+1;
            }
        }

    // return t;
    return low;

    }

    public int timeToEat(int speed, int[] piles){
        int t = 0;
        for(int i:piles){
            t = t+ (int)Math.ceil(1.0*i/ speed);
        }

        return t;
    }
}