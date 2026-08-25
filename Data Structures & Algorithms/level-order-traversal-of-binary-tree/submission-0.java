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
    void search(TreeNode tree, Map<Integer, List<Integer>> maps, int level) {
        if (!Objects.nonNull(tree)) return;
        maps.computeIfAbsent(level, k -> new ArrayList<>()).add(tree.val);
        if (tree.left == null && tree.right == null) {
            return;
        }
        if (Objects.nonNull(tree.left)) {
            search(tree.left, maps, level + 1);
        } 
        if (Objects.nonNull(tree.right)) {
            search(tree.right, maps, level + 1);
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Map<Integer, List<Integer>> maps = new HashMap<>();
        search(root, maps, 0);

        List<List<Integer>> results = new ArrayList<>();

        for (List<Integer> value : maps.values()) results.add(value);

        return results;
    }
}
