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
    // public int findheight(TreeNode root){
    //     if(root == null) return 0;
    //     if(root.left != null){
    //         int l_height = 1+findheight(root.left);
    //     }
    //     if(root.right != null){
    //         int r_height = 1+fingheight(root.right);
    //     }

    //     return Math.max(l_height, r_height);
        
    // }
    public int findBottomLeftValue(TreeNode root) {
        // int height = findheight(root);
        // level order traversal
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        // ArrayList<Integer> arr = new ArrayList<>();
        int last = 0;

    

        while(!q.isEmpty()){
            int count = q.size();
            for(int i=0;i<count;i++){
                TreeNode temp = q.poll();
                if(i==0) last = temp.val;
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);

            }
            
        }

        return last;

        
    }
}