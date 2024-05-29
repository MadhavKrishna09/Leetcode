class Solution {
    // "public int numSteps(String s) {
    //     int steps = 0;

    //     if(s.length() == 1) return steps;
    //     int num = Integer.parseInt(s, 2);

    //     while(num>1){
    //         if(num%2 == 0) num = num/2;
    //         else{
    //             num+=1;
    //         }
    //         steps++;
    //     }

    //     return steps;
    // }"

    public int numSteps(String s) {
        int steps = 0;
        int carry = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(i) - '0' + carry == 1) {
                carry = 1;
                steps += 2; 
            } else {
                steps += 1;
            }
        }
        return steps + carry;
    }
}