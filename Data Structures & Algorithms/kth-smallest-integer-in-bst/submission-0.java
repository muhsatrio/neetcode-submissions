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
    void search(TreeNode node, Map<Integer, Integer> maps) {
        if (node == null) return;

        maps.put(node.val, 1);

        search(node.left, maps);
        search(node.right, maps);
    }

    public int kthSmallest(TreeNode root, int k) {
        Map<Integer, Integer> maps = new TreeMap<>();

        search(root, maps);

        int result = -1;

        for (Integer key : maps.keySet()) {
            if (k == 1) {
                result = key;
                break;
            }
            else k--;
        }

        return result;
    }
}
