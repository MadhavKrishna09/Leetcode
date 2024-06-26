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
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        

        if(root == null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            ArrayList<Integer> temp = new ArrayList<>();
            while(n>0){
                TreeNode node = q.poll();
                temp.add(node.val);
                if(node.left!=null){
                    q.offer(node.left);
                }

                if(node.right!=null){
                    q.offer(node.right);
                }
                n--;
            

            }

            ans.add(temp);
            // temp.clear();
            
        }
        return ans;
    }
}