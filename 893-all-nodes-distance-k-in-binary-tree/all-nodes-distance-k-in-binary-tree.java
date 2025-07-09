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
    List<Integer> ans;
    Set<TreeNode> visited ;
    Map<TreeNode, TreeNode> mp;
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
         ans = new ArrayList<>();
         visited = new HashSet<>();
         mp = new HashMap<>();
         mapParent(root, null);
         add(target, k);
         return ans;

    }

    private void mapParent(TreeNode node, TreeNode parent){
        if(node == null){
            return;
        }
        mp.put(node, parent);
        mapParent(node.left, node);
        mapParent(node.right, node);
    }
    private void add(TreeNode root, int k){
        if(root == null || visited.contains(root)){
            return;
        }
        visited.add(root);

        if(k==0){
            ans.add(root.val);
            return;
        }

        add(root.left, k-1);
        add(root.right, k-1);
        add(mp.get(root), k-1);
    }
}