class Solution {
    public int lengthOfLongestSubstring(String s) {
    //     int ans = 0;
    //     int i = 0;
    //     int j = 0;
    //     int n = s.length();
    //     // HashSet<Integer> st = new HashSet<>();
    //     HashMap<Character, Integer> mp = new HashMap<>();
    //     // for(int i = 0;i<s.length();i++){
    //     //     // HashSet<Integer> 
    //     //     if(st.)
    //     // }
    //     while(j<n){
    //         if(mp.containsKey(s.charAt(j))) {
    //             i = Math.max(i, mp.get(s.charAt(j)) + 1);
    //         }
    //         mp.put(s.charAt(j), j);
    //         ans = Math.max(j-i +1, ans);
    //         j++;
    //     }

    //     return ans;
    int n = s.length();
    int maxLen = 0;
    int left = 0, right = 0;
    HashSet<Character> set = new HashSet<>();

    while(right < n) {
        if (!set.contains(s.charAt(right))) {
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        } else {
            set.remove(s.charAt(left));
            left++;
        }
    }
    return maxLen;


























        // Set<Character> st = new HashSet<>();
        // Map<Character, Integer> mp = new HashMap<>();
        // int windowStart = 0;
        // int ans = 0;
        // if(s.isEmpty()) return 0;
        // // if(s == null || s.trim().isEmpty()) return 1;

        // for(int i=0;i<s.length();i++){
        //     char c = s.charAt(i);
        //     if(mp.containsKey(c) && mp.get(c) >= windowStart){
        //         // ans = Math.max(ans, i-windowStart);
        //         windowStart = mp.get(c)+1;

        //         // windowStart++;
        //     }
        //     mp.put(c, i); 
        //     ans = Math.max(ans, i - windowStart + 1);
        // }

        // return ans;


        
    }
}