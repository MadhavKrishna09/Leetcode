class Solution {
    public int getMaxLen(int[] nums) {
        int length = nums.length;
        int posLength = nums[0]>0?1:0;
        int negLength = nums[0]<0?1:0;
        int answer = posLength;
        // nums[0] >0 

        for(int i=1;i<length;i++){
            if(nums[i] ==0){
                posLength = 0;
                negLength = 0;
            }
            else if(nums[i] > 0){
                posLength ++;
                if(negLength > 0) negLength++;
            }
            else{
                int t = posLength;
                if(negLength>0)
                    posLength = negLength+1;
                else
                    posLength = negLength;
                negLength = t+1;

            }

            answer = Math.max(answer, posLength);
        }

        return answer;

    }
}