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
    public boolean isBalanced(TreeNode root) {
        int diff = height(root);

        return  diff != -1;
        
    }

    public int height(TreeNode root){
        if(root == null) return 0;

        int leftL = height(root.left);
        if(leftL == -1 ) return -1;
        int rightL = height(root.right);
        if(rightL == -1 ) return -1;


        if(Math.abs(leftL - rightL) > 1) return -1;

        return Math.max(leftL,rightL)+1;
    }
}