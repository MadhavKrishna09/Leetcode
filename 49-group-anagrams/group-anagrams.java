class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();

        for(String str: strs){
            char[] temp = str.toCharArray();
            // String temp = Arrays.sort(str.toCharArray());
            Arrays.sort(temp);
            if(mp.containsKey(String.valueOf(temp))){
                mp.get(String.valueOf(temp)).add(str);
            }
            else{
                List<String> t = new ArrayList<>();
                t.add(str);
                mp.put(String.valueOf(temp) , t);
            }
        }

        for(List<String> st : mp.values()){
            answer.add(st);
        }
        return answer;
    }
}