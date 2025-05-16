class Solution {
    public int maxArea(int[] h) {
        int i = 0;
        int j = h.length-1;
        int area = 0;
        while(i<j){
            area = Math.max(area, Math.min(h[i] , h[j]) * (j-i));
            if(h[j] < h[i]){
                j--;
            }
            else
                i++;
        }

        return area;
    }
}