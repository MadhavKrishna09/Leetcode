class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int[] platePrefixSum = new int[n + 1];
        int[] nextCandle = new int[n];
        int[] prevCandle = new int[n];

        for (int i = 0; i < n; i++) {
            platePrefixSum[i + 1] = platePrefixSum[i] + (s.charAt(i) == '*' ? 1 : 0);
        }

        int lastCandle = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '|') {
                lastCandle = i;
            }
            prevCandle[i] = lastCandle;
        }

        lastCandle = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '|') {
                lastCandle = i;
            }
            nextCandle[i] = lastCandle;
        }

        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int queryStart = queries[i][0];
            int queryEnd = queries[i][1];

            int firstCandle = nextCandle[queryStart];
            int lastCandleIndex = prevCandle[queryEnd];

            if (firstCandle != -1 && lastCandleIndex != -1 && firstCandle < lastCandleIndex) {
                answer[i] = platePrefixSum[lastCandleIndex + 1] - platePrefixSum[firstCandle];
            } else {
                answer[i] = 0;
            }
        }

        return answer;
    }
}