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
    public List<String> binaryTreePaths(TreeNode root) {
        // leaf node have both left and right null;
        List<String> ans = new ArrayList<>();
        if(root == null) return ans;

        String s = Integer.toString(root.val);
        if(root.left == null && root.right == null) ans.add(s);
        if(root.left != null) dfs(root.left, s,ans);
        if(root.right != null) dfs(root.right, s, ans);

        return ans;
   
    }

    public void dfs(TreeNode node, String current_path, List ans){
        current_path += "->" + node.val;
        if(node.left == null && node.right == null){
            ans.add(current_path);
            return;
        }
        
        if(node.left != null) dfs(node.left, current_path,ans);
        if(node.right != null) dfs(node.right, current_path, ans);


    }
}