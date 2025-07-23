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
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int s = treeSum(root, mp);
        // int max = Integer.MIN_VALUE;
        // for(int i:mp.values()){
        //     max = Math.max(max, i);
        // }

        List<Integer> arr = new ArrayList<>();
int max = Integer.MIN_VALUE;
for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
    int freq = entry.getValue();
    if (freq > max) {
        arr.clear();
        arr.add(entry.getKey());
        max = freq;
    } else if (freq == max) {
        arr.add(entry.getKey());
    }
}
    
        return arr.stream().mapToInt(i->i).toArray();
    }

    public int treeSum(TreeNode root, Map<Integer, Integer> mp){
        if(root == null) return 0 ;
        int val = root.val;
        int left = treeSum(root.left, mp);
        int right = treeSum(root.right, mp);
        int sum = val+left+right;
        mp.put(sum, mp.getOrDefault(sum, 0) +1);
        return sum;
    }
}