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
    int count = 0;
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        // int count = 0;
        int v = root.val;
        // if(v)
        countnum(root, v);
        return count;
    }
    public void countnum(TreeNode root,int v){
        if(root == null) return;
        v= Math.max(v, root.val);
        if(root.val>=v) count = count+1;
        countnum(root.left, v);
        countnum(root.right, v);
    }
}