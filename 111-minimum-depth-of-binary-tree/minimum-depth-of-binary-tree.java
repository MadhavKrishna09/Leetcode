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
    public int minDepth(TreeNode root) {
        //  List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int min = 0;
        // int level = 0;

        if(root==null) return 0;

        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            // TreeNode node = q.peek();
            min++;
            

            
            // ArrayList<Integer> ar = new ArrayList<>();
            
            

            while(n>0){
                TreeNode temp = q.poll();
                if(temp.left==null && temp.right == null){
                return min;
            }
                // ar.add(temp.val);
                if(temp.left!=null) q.offer(temp.left);
                if(temp.right!=null) q.offer(temp.right);
                
                n--;
                
            }

        }

        return min;
    }
}