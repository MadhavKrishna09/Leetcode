class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        int max = 0;
        int n = s.length();

        for(char c: s.toCharArray()){
            int i = c-'a';
            freq[i]++;
            max = Math.max(freq[i], max);
        }

        if(max>(n+1)/2){
            return "";
        }

        StringBuilder sb = new StringBuilder();
        PriorityQueue<int[]>  order = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int i = 0;i<26;i++){
            if(freq[i]!=0){
                order.offer(new int[]{freq[i], i});
            }
            
        }

        while (order.size() > 1) {
            int[] first = order.poll();
            int[] second = order.poll();
            sb.append((char)(first[1] + 'a'));
            sb.append((char)(second[1] + 'a'));
            if (--first[0] > 0) order.offer(first);
            if (--second[0] > 0) order.offer(second);
        }
        if (!order.isEmpty()) sb.append((char)(order.poll()[1] + 'a'));
        return sb.toString();
    }
}