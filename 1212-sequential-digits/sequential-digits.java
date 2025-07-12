class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> answer = new ArrayList<Integer>();
        // for(int i= low;i<=high;i++){
        //     if(isSequential(i)){
        //         answer.add(i);
        //     }
        // }
        for(int i = 1;i<=9;i++){
            int num = i;
            for(int j = i+1;j<=9;j++){
                num = num*10 + j;
                if(num>=low && num<=high){
                    answer.add(num);
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }

    // private boolean isSequential(int i){
    //     char[] st = String.valueOf(i).toCharArray();
    //     for(int j = 1;j<st.length;j++){
    //         if(st[j] - st[j-1] !=  1){
    //             return false;
    //         }
    //     }

    //     return true;
    // }
}