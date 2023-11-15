/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null||root ==p || root == q) return root;
        // if(root.val == p.val || root.val == q.val) return root;
        TreeNode left = root.left;
        // if(left.val == p.val || left.val == q.val) return left;
        left = lowestCommonAncestor(root.left,p,q);

        TreeNode right = root.right;
        // if(right.val == p.val || right.val == q.val) return right;
        right = lowestCommonAncestor(root.right,p,q);

        // if(left!=null && right !=null) return root;
        if(left == null) {
            return right;
        }
        else if(right == null){
             return left; 
            }
        else {
            return root;
            }
    }
}