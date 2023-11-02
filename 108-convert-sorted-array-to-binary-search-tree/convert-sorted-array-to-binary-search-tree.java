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
    public TreeNode sortedArrayToBST(int[] nums) {
        return makeTree(nums, 0,nums.length-1);
        // here we ahve to always calculate the middle element thats why hme 2 function use krne pde.
    }

    public TreeNode makeTree(int[] arr, int l, int h){
        if(l>h) return null;

        int m = (l+h)/2;

        
        TreeNode root = new TreeNode(arr[m]);
        root.left = makeTree(arr,l,m-1);
        root.right = makeTree(arr,m+1,h);

        return root;

    }
        

        
}