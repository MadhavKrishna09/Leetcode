class Solution {
    public int sumOfElements(int f,int l){
        int sum =0;
        for(int i=f;i<=l;i++){
            sum += i;
        }
        return sum;
    }


    public int pivotInteger(int n) {
        int pivot = 1;
        while(pivot<=n){
            if(sumOfElements(1,pivot) == sumOfElements(pivot,n))
                return pivot;
            else pivot++;
        }

        return -1;
        
    }
}