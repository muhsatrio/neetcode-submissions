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
    void search(TreeNode root, int depth, Map<Integer, Integer> maps) {
        if (root == null) return;

        depth++;

        maps.put(depth, 1);

        search(root.left, depth, maps);
        search(root.right, depth, maps);
    }
    public int maxDepth(TreeNode root) {
        Map<Integer, Integer> maps = new HashMap<>();

        search(root, 0, maps);

        int result = 0;

        for (Integer key : maps.keySet()) {
            result = Math.max(result, key);
        }

        return result;
    }
}
