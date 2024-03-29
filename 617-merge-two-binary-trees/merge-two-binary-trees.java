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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return null;

        /// 1st solutin brute force
        // TreeNode root;
        // if(root1 == null ){
        //      root = new TreeNode(root2.val);
        //      root.left = mergeTrees(null, root2.left);
        //     root.right = mergeTrees(null, root2.right);
        // }
        // else if(root2 == null ){
        //      root = new TreeNode(root1.val);
        //      // after null what should we do like we can not call left and right then;
        //      root.left = mergeTrees(root1.left, null);
        //     root.right = mergeTrees(root1.right, null);
        // }
        // else{
        //      root = new TreeNode(root1.val+root2.val);
        //      root.left = mergeTrees(root1.left, root2.left);
        //     root.right = mergeTrees(root1.right, root2.right);
        // }

        /// 2nd solution optimized

        int value = (root1 == null ? 0:root1.val) + (root2 == null ? 0: root2.val);
        TreeNode root = new TreeNode(value);
        root.left = mergeTrees(root1 == null? null:root1.left, root2 == null?null:root2.left);
        root.right = mergeTrees(root1 == null? null:root1.right, root2 == null?null:root2.right);


        

        return root;
        
    }
}