class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            String[] arrA = a.split(" ", 2);
            String[] arrB = b.split(" ", 2);
            boolean isDigitA = Character.isDigit(arrA[1].charAt(0));
            boolean isDigitB = Character.isDigit(arrB[1].charAt(0));
            if (!isDigitA && !isDigitB) {
                int cmp = arrA[1].compareTo(arrB[1]);
                return cmp != 0 ? cmp : arrA[0].compareTo(arrB[0]);
            }
            return isDigitA ? (isDigitB ? 0 : 1) : -1;
        });
        return logs;
    }
}