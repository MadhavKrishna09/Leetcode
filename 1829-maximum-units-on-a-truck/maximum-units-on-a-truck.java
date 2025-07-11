class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> 
            b[1]-a[1]
        );

        int answer = 0;
        int n = boxTypes.length;
        int load = 0;
        for(int i = 0;i<n;i++){
            // load+=boxTypes[i][0];
            if(load+boxTypes[i][0] <= truckSize){
                answer += boxTypes[i][0] * boxTypes[i][1];
                load+=boxTypes[i][0];
            }
            else{
                int t = truckSize - load;
                answer+= t*boxTypes[i][1];
                break;
            }
        }

        return answer;

    }
}