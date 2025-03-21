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
    int ans = 0;
    public int helper(TreeNode root, int v){
        if(root == null) return 0;
        // if(root.val<val) 
        if(root.val>= v)  return 1+helper(root.left, Math.max(v, root.val)) + helper(root.right, Math.max(v, root.val));
        // else if(root.val<val ) return 0;
        else return helper(root.left, Math.max(v, root.val)) + helper(root.right, Math.max(v, root.val));
        // else return 0;


    }
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        return helper(root, root.val);
        
    }
}