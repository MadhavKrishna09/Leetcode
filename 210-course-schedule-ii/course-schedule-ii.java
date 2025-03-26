class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
        //topological sorting
        int[] ans = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] p : pre ){
            adj.get(p[1]).add(p[0]);
        }

        Stack<Integer> st = new Stack<>();
        int[] visited = new int[numCourses];
        for(int i = 0;i<numCourses;i++){
            if(visited[i] !=1 && dfs(adj, i, st, visited))
                return new int[0];
            
        }

        // if(st.size() < numCourses) return ans;
        for(int i = 0;i<numCourses;i++){
            if(!st.isEmpty())
             ans[i] = st.pop();
        }

        return ans;
    }
    // use 3 variable for visited array 0: not vosited 1: visiting 2: visited 
    private boolean dfs(List<List<Integer>> adj, int i, Stack<Integer> st, int[] visited){
        // st.push(i);
        if (visited[i] == 1) return true; // Cycle detected
        if (visited[i] == 2) return false; // Already processed

        visited[i] = 1; // Mark as visiting
        for(int j:adj.get(i)){
            // visited[i] = 1;
            if(dfs(adj, j, st, visited)){
                return true;
                // visited[i] = 1;
                
                // st.push(j);
            }
        }
        visited[i] = 2;
        st.push(i);
        return false;
    }
}