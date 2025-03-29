class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] size = new int[n+1];
        int[] parent = new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i] = i;
            size[i] = 1;
        }

        for(int[] i:edges){
            int u = i[0];
            int v = i[1];
            int pu = findParent(parent, size, u);
            int pv = findParent(parent, size, v);
            if(pu == pv){
                return new int[]{u,v};
            }
            else{
                makeUnion(parent, size, pu, pv);
            }
        }
    return new int[]{0,0};

    }

    public int findParent(int[] parent, int[] size, int u){
        if(parent[u] ==u) return u;
        
        return parent[u] = findParent(parent, size, parent[u]);
        
    }

    public void makeUnion(int[] parent, int[] size, int u, int v){
        // int pu = findParent(parent, size, u);
        // int pv = findParent(parent, size, v);
        if(size[u] < size[v]){
            parent[u] = v;
            size[v] +=size[u];
        }
        else{
            parent[v] = u;
            size[v] += size[u];
        }
    }
}