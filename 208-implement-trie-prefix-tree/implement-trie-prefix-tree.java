class TrieNode {
    boolean flag;
    TrieNode[] child;
    TrieNode(){
        child = new TrieNode[26];
        flag = false;
    }
}

class Trie {
    private TrieNode root;
    public Trie() {
       root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr = root;
        for(char c: word.toCharArray()){
            int t = c-'a';
            if(curr.child[t] ==null ){
                curr.child[t] = new TrieNode();
            }
            curr = curr.child[t];
        }
        curr.flag = true;
    }
    
    public boolean search(String word) {
        TrieNode curr = root;
        for(char c : word.toCharArray()){
            int t = c-'a';
            if(curr.child[t] == null){
                return false;
            }
            curr = curr.child[t];
        }
        return curr.flag;
        
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr = root;
        for(char c : prefix.toCharArray()){
            int t = c-'a';
            if(curr.child[t] == null){
                return false;
            }
            curr = curr.child[t];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */