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
    public void helper(TreeNode root, PriorityQueue<Integer> pq){
        if(root == null) return ;
        pq.offer(root.val);
        helper(root.left, pq);
        helper(root.right, pq);
    }
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        helper(root, pq);
        while(k>1){
            pq.poll();
            k--;
        }

        // return !pq.isEmpty()? pq.peek(): 0;
        return pq.peek();

    }
}