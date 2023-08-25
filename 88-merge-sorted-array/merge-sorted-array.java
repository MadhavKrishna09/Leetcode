class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j =0;
        int k =0;
        int[] num = new int[m];
        for(int a =0;a<m;a++){
            num[a] = nums1[a];
        }
        while(i<m&&j<n){
            if(num[i]<nums2[j]){
                nums1[k++] = num[i];
                i++;
            }
            else{
                nums1[k++] =nums2[j++]; 
            }
        }

        while(i<m){
            nums1[k++] = num[i++];
        }

        while(j<n){
            nums1[k++] = nums2[j++];
        }

    }
}