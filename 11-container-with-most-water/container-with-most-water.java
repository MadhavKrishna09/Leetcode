class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int l =0;
        int h = height.length-1;
        while(l<h){
            ans = Math.max(Math.min(height[l],height[h])*(h-l),ans );

            if(height[l]<height[h])
            l++;
            else
            h--;
        }
        return ans;
    }
}