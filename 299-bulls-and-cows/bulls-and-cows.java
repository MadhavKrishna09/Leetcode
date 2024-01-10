class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        StringBuilder st = new StringBuilder(secret);
        StringBuilder gs = new StringBuilder(guess);

        // Count bulls and remove matched characters
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
                st.setCharAt(i, '*'); // Mark characters to ignore later
                gs.setCharAt(i, '*');
            }
        }

        // Count cows
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != '*' && gs.indexOf(String.valueOf(st.charAt(i))) != -1) {
                cows++;
                int index = gs.indexOf(String.valueOf(st.charAt(i)));
                gs.setCharAt(index, '*'); // Mark characters to ignore later
            }
        }

        return bulls + "A" + cows + "B";
    }
}
