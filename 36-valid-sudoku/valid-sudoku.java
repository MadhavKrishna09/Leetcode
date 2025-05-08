// import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>(); // Track uniqueness

        for (int i = 0; i < 9; i++) { // Iterate rows
            for (int j = 0; j < 9; j++) { // Iterate columns
                char current = board[i][j];
                if (current != '.') { // Skip empty cells
                    // Check row, column, and sub-box in one step
                    if (!seen.add(current + " in row " + i) || // Row check
                        !seen.add(current + " in column " + j) || // Column check
                        !seen.add(current + " in box " + i/3 + "-" + j/3)) { // Sub-box check
                        return false; // Duplicate found
                    }
                }
            }
        }
        return true; // All checks passed
    }
}