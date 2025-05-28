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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        if(root == null) return ls;
        Queue<TreeNode> st = new LinkedList<>();
        st.offer(root);
        traverse(root, ls, st);

        // if(rootst.push(root);
        return ls;
    }

    public void traverse(TreeNode tree, List<List<Integer>> ls, Queue<TreeNode> st){
        while(!st.isEmpty()){
            int i = 0;
            int s = st.size();
             List<Integer> t= new ArrayList<>();
            while(i<s){
                TreeNode n = st.poll();
                if(n.left!=null) st.offer(n.left);
                if(n.right!=null) st.offer(n.right);
                t.add(n.val);
                i++;
            }
            ls.add(t);
            
        }
    }
}