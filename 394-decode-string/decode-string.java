class Solution {
    public String decodeString(String s) {
        // #hards
        Stack<String> sr = new Stack<>();
        Stack<Integer> it = new Stack<>();
        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                int num = 0;
                while (Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                it.push(num);
            } else if (s.charAt(i) != ']') {
                sr.push(String.valueOf(s.charAt(i)));
                i++;
            } else {
                StringBuilder temp = new StringBuilder();
                int repeat = it.pop();

                while (!sr.isEmpty() && !sr.peek().equals("[")) {
                    temp.insert(0, sr.pop());
                }

                if (!sr.isEmpty()) {
                    sr.pop(); // Remove '['
                }

                String str = temp.toString();
                for (int j = 0; j < repeat; j++) {
                    sb.append(str);
                }
                sr.push(sb.toString());
                sb.setLength(0);
                i++;
            }
        }

        while (!sr.isEmpty()) {
            sb.insert(0, sr.pop());
        }
        return sb.toString();
    }
}
