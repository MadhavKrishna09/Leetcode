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
    // int ans = Integer.MIN_VALUE;
    // public int diameterOfBinaryTree(TreeNode root) {
        // if (root == null ) return 0;
        
        // int left = diameterOfBinaryTree(root.left);
        // int right = diameterOfBinaryTree(root.right);
        // ans = Math.max(ans, left+right);

        // return 1 + Math.max(left, right);
    private int maxDiameter;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        calculateHeight(root);
        return maxDiameter;
    }

    private int calculateHeight(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
        
    // }
    // public int 
}