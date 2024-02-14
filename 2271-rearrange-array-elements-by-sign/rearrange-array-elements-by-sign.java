class Solution {
    public int[] rearrangeArray(int[] nums) {
        // int[] positive = new int[nums.length/2];
        // int[] negative = new int[nums.length/2];
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        // ArrayList<Integer> ans = new ArrayList<>();

        for(int n:nums){
            if(n<0){
                negative.add(n);
            }
            else{
                positive.add(n);
            }
        }
        for(int i =0;i<nums.length;i++){
            if(i%2 == 0){
                nums[i] = positive.get(i/2);
            }
            else{
                nums[i] = negative.get(i/2);
            }
            // ans.add(positive.get(i));
            // ans.add(negative.get(i));
        }
        // int[] arr = new int[ans.size()];
        // int[] arr = new int[ans.toArray()];


        return nums;
    }
}