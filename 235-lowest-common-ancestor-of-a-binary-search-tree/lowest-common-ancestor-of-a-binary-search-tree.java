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
        // go until we found value of p and q;
        if(root == null) return null;
        // while(root!=null && ((p.val<root.val && q.val<root.val) || (p.val>root.val && q.val>root.val)) ){
        //     if(p.val<root.val && q.val<root.val) root = root.left;
        //     if(p.val>root.val && q.val>root.val) root = root.right;
        //     // return root;
        // }
        // return root;
        if(p.val<root.val && q.val<root.val) return lowestCommonAncestor(root.left,p,q);
        if(p.val>root.val && q.val>root.val) return lowestCommonAncestor(root.right,p,q);

        return root;
         
        

        
    }
}