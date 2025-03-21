/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        // Stack<TreeNode> st = new Stack<>();

        q.offer(root);
        // ans.add(root.val);
        while(!q.isEmpty()){
            int n = q.size();
            TreeNode node = null;
            while(n>0){
                TreeNode t = q.poll();
                node = t;
                if(t.left!=null) {
                    q.offer(t.left);
                    // st.push(t.left);
                }
                    
                if(t.right!=null) {
                    q.offer(t.right);
                    // st.push(t.right);
                    }
                n--;
                
            }
            if(node!=null) ans.add(node.val);

        }

        return ans;

    }
}