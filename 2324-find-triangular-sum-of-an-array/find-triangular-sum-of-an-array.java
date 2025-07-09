class Solution {
    public int triangularSum(int[] nums) {
        int n  = nums.length;
        if(n==1) {
            return nums[0];
        }
       List<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            arr.add(num);
        }
        while(arr.size()>1){
            for(int i = 0;i<arr.size()-1;i++){
                int f = arr.get(i);
                int s = arr.get(i+1);
                arr.set(i, (f+s)%10);
            }
            arr.remove(arr.size()-1);
        }

        return arr.get(0);
    }
}