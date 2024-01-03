public class Solution {

    public long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }

    public void bs(long l, long h, int divisor1, int divisor2, long lcm, long[] ans, int c1, int c2) {
        if (l <= h) {
            long m = (l + h) / 2;

            long a, b, c;

            a = m - (m / divisor1);
            b = m - (m / divisor2);
            c = m - (m / divisor1) - (m / divisor2) + (m / lcm);

            // System.out.println(m + " " + a + " " + b + " " + c);

            if (a >= c1 && b >= c2 && a + b - c >= c1 + c2) {
                ans[0] = m;
                bs(l, m - 1, divisor1, divisor2, lcm, ans, c1, c2);
            } else {
                bs(m + 1, h, divisor1, divisor2, lcm, ans, c1, c2);
            }
        }
    }

    public int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        long g = gcd(Math.max(divisor1, divisor2), Math.min(divisor1, divisor2));
        long l = ((long) divisor1 * (long) divisor2) / g;

        long[] ans = { 1000000000 };

        bs(2, 10000000000L, divisor1, divisor2, l, ans, uniqueCnt1, uniqueCnt2);

        return (int) ans[0];

    }

    // public static void main(String[] args) {
    //     Solution solution = new Solution();
    //     int divisor1 = 3, divisor2 = 4, uniqueCnt1 = 2, uniqueCnt2 = 3;
    //     int result = solution.minimizeSet(divisor1, divisor2, uniqueCnt1, uniqueCnt2);
    //     System.out.println("Result: " + result);
    // }
}
