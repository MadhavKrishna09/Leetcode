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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode v = root.left;
        root.left = root.right;
        root.right = v;
        // if(root.left == null || root.right ==null) return root;
        // helper(root.left, root.right);
        invertTree(root.left);
        invertTree(root.right);
        return root;
        
    }
    // public void helper(TreeNode left, TreeNode right){
    //     if(left == null || right == null) return; 
    //     // if(left.left==null || right.right==null) return;
    //     TreeNode v = left;
    //     left = right;
    //     right = v;
    //     // helper(left.left, right.right);
    //     helper(left.right, right.left);
    // }
}