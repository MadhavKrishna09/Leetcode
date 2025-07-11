class Solution {
    // public List<Integer> goodDaysToRobBank(int[] security, int time) {
    //     List<Integer> answer = new ArrayList<>();
    //     int length = security.length;
    //     if(time>=length ) return answer;


    //     for(int i = time;i<length-time;i++){
    //         if(isDecreasing(security, i-time, i) && isIncreasing(security, i, i+time)){
    //             answer.add(i);
    //         }

    //     }
    //     return answer;

        
    // }
    // private boolean isDecreasing(int[] security, int i , int n){
    //     for(;i<n;i++){
    //         if(security[i] < security[i+1]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    //  private boolean isIncreasing(int[] security, int i , int n){
    //     for(;i<n;i++){
    //         if(security[i] > security[i+1]){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    public List<Integer> goodDaysToRobBank(int[] nums, int time){
        List<Integer> answer = new ArrayList<>();
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        if(time>=n) return answer;
        left[0] = 1;
        right[n-1] = 1;
        for(int i = 1;i<n;i++){
            if(nums[i] <= nums[i-1]){
                left[i] = left[i-1]+1;
            }
            else{
                left[i] = 1;
            }
        }
        for(int i = n-2;i>=0;i--){
            if(nums[i] <= nums[i+1]){
                right[i] = right[i+1]+1;
            }
            else{
                right[i] = 1;
            }
        }

        for(int i = time;i<n-time;i++){
            if(left[i] >= time +1 && right[i]>=time+1){
                answer.add(i);
            }
        }
        return answer;

    }
}