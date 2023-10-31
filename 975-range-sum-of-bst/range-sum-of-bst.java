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
    public int rangeSumBST(TreeNode root, int low, int high) {
        //which ans will be return at second.
        // int ans = 0;
        if(root == null) return 0;

        if(root.val<low) return rangeSumBST(root.right,low,high);//no more left
        if(root.val>high) return rangeSumBST(root.left,low,high);//no more right



        return root.val+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
        
    }
}