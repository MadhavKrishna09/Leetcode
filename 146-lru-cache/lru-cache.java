class LRUCache {
    Map<Integer, Integer> mp;
    int lru ;
    int c ;
    Queue<Integer> q;

    public LRUCache(int capacity) {
        mp = new HashMap<>(capacity);
        c = capacity;
        q = new LinkedList<>();
    }
    
    public int get(int key) {
        if(!mp.containsKey(key)){
            return -1;
        }

        q.remove(key);
        q.offer(key);


        return mp.get(key);
        
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            mp.put(key, value);
            q.remove(key);
            q.offer(key);
        }
        else if(mp.size()>=c){
            mp.remove(q.poll());
            // q.poll();
            mp.put(key, value);
            q.offer(key);
        }
        else{
            mp.put(key, value);
            q.offer(key);
        }

        

        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */