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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> allPath = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        findPath(root, sum, allPath, currentPath);
        return allPath;
    }

    public void findPath(TreeNode root, int sum, List<List<Integer>> allPath, List<Integer> currentPath){
        if(root==null) return;

        currentPath.add(root.val);

        if(root.val == sum && root.left == null && root.right == null){
            allPath.add(new ArrayList(currentPath));
        }
        else{
            findPath(root.left, sum-root.val, allPath, currentPath);
            findPath(root.right, sum-root.val, allPath, currentPath);
        }
        currentPath.remove(currentPath.size()-1);
    }
}