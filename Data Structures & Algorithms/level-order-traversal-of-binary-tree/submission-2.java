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

// Input: root = [1,2,3,4,5,6,7]

// Output: [[1],[2,3],[4,5,6,7]]

class Solution {
    void search(TreeNode tree, Map<Integer, List<Integer>> maps, int level) {
        if (tree == null) return;
        
        maps.computeIfAbsent(level, k -> new ArrayList<>()).add(tree.val);
        
        search(tree.left, maps, level + 1);
        search(tree.right, maps, level + 1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Map<Integer, List<Integer>> maps = new HashMap<>();
        search(root, maps, 0);

        List<List<Integer>> results = new ArrayList<>();

        for (List<Integer> value : maps.values()) results.add(value);

        return results;
    }
}
