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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        // int level = 0;

        // if(root==null) return ans;

        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            ArrayList<Integer> ar = new ArrayList<>();
            double sum = 0;

            for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                sum += temp.val;
                if (temp.left != null) q.offer(temp.left);
                if (temp.right != null) q.offer(temp.right);
            }
            // level++;
            // if(level%2 == 0) Collections.reverse(ar);
            
            

            ans.add(sum/n);

        }

        return ans;
    }
}