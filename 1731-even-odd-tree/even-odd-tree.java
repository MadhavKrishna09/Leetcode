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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int count = 0;
        q.offer(root);
        // if(root.val%2 ==0) return false;
        int level = 0;

        while(!q.isEmpty()){
            int prev = level % 2 ==0 ? -1 : Integer.MAX_VALUE;
            
            int s = q.size();
            for(int i=0;i<s;i++){
                TreeNode temp = q.poll();
                if(level % 2 == 1){
                    if(temp.val %2 == 1 || prev<=temp.val )return false;
                    }
                
                else{
                    if(temp.val % 2 == 0 || prev>=temp.val )return false;
                }
            prev = temp.val;

            if(temp.left != null) q.offer(temp.left);
            if(temp.right != null) q.offer(temp.right);
            }
            level++; 
        }

        return true;
        
    }
}