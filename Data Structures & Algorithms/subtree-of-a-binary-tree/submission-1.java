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

// Input: root = [1,2,3,4,5], subRoot = [2,4,5]

// Output: true

class Solution {
    boolean search(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;

        if (root == null || subRoot == null) return false;

        if (root.val != subRoot.val) return false;

        return search(root.left, subRoot.left) && search(root.right, subRoot.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        if (search(root, subRoot)) return true;

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
