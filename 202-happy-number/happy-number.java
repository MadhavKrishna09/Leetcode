class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;

        do{
            slow = findSquareSum(slow);
            fast = findSquareSum(findSquareSum(fast));
        }while(slow != fast);

        return slow == 1;
    }

    public int findSquareSum(int num){
        int digit = 0;
        int sum = 0;
        while(num>0 ){
            digit = num%10;
            sum += digit*digit;
            num = num/10;
        }

        return sum;
    }
}