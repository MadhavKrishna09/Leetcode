class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;
        for(int[] k: matrix){
            if(k[j] >= target && k[i]<=target){
                while(i<=j){
                    int mid = (i+j)/2;
                    if(k[mid] == target) return true;
                    else if(k[mid] < target){
                        i = mid+1;
                    }
                    else{
                        j = mid-1;
                    }
                }
                
                
            }
        }

        return false;
    }
}