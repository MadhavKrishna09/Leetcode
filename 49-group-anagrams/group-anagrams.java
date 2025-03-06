class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // can we short a word based on its asscii value of its letters.
        // Map<String, List<String>> anagramGroups = new HashMap<>();
        
        // // Iterate through each word in the input array
        // for (String word : strs) {
        //     // Sort the characters in the word to create a key
        //     char[] charArray = word.toCharArray();
        //     Arrays.sort(charArray);
        //     String key = new String(charArray);
            
        //     // If key is not in the map, add a new entry with the word as a list
        //     if (!anagramGroups.containsKey(key)) {
        //         anagramGroups.put(key, new ArrayList<>());
        //         anagramGroups.get(key).add(word);
        //     }
        //     // If key is already present, append the word to the existing list
        //     else {
        //         anagramGroups.get(key).add(word);
        //     }
        // }
        
        // // Convert map values to a list and return
        // return new ArrayList<>(anagramGroups.values());

        Map<String, List<String>> mp = new HashMap<>();
        for(String word: strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if(!mp.containsKey(key)){
                mp.put(key, new ArrayList<>());
                mp.get(key).add(word);
            }
            else{
                mp.get(key).add(word);
            }

        }

        return new ArrayList<>(mp.values());
    }
}