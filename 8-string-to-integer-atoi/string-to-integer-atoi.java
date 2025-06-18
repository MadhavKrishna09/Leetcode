class Solution {
    public int myAtoi(String s) {
        int i = 0; // Use 'i' as the main index to traverse the string
        int n = s.length();

        // 1. Discard leading whitespace (fixed: using manual loop instead of trim())
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // If after skipping whitespace, the string is empty or we reached the end
        if (i == n) {
            return 0;
        }

        // 2. Determine the sign (fixed: correct char comparison and logic)
        int sign = 1; // Assume positive by default
        if (s.charAt(i) == '-') {
            sign = -1;
            i++; // Move past the '-'
        } else if (s.charAt(i) == '+') { // Fixed: char literal '+'
            i++; // Move past the '+'
        }
        // Removed: if(Character.isLetter(s.charAt(0))) return 0;
        // This check was problematic as it was done on the *original* s.charAt(0)
        // after trim, and signs are not letters. The current flow handles it.

        long result = 0; // Use long to store the number to detect overflow before int conversion

        // Removed: StringBuilder and leading zero skipping loop (this was buggy)
        // The main digit reading loop will handle leading zeros naturally.
        // Removed: while(j<s.length() && s.charAt(j) == 0){ ... }

        // 3. Read digits (fixed: now directly building 'result' long and checking for overflow)
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0'; // Convert char to integer digit

            // Check for overflow before appending the digit.
            // This is crucial for stopping at MAX_VALUE/MIN_VALUE correctly.
            // For positive numbers:
            if (sign == 1) {
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return Integer.MAX_VALUE;
                }
            }
            // For negative numbers: (Note: Integer.MIN_VALUE is -2147483648, so its positive magnitude is 2147483648)
            else { // sign == -1
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 8)) {
                    // We check against Integer.MAX_VALUE / 10 because `result` itself is kept positive
                    // until the very end. The `digit > 8` accounts for the extra magnitude of MIN_VALUE.
                    return Integer.MIN_VALUE;
                }
            }

            result = result * 10 + digit; // Build the number
            i++; // Move to the next character
        }

        // Apply the sign at the end
        result *= sign;

        // 4. Clamping to 32-bit signed integer range (final check)
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        // Return the result as an int
        return (int) result;
    }
}