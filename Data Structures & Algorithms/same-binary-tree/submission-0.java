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
    boolean search(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p == null) return false;
        else if (q == null) return false;

        if (p.val != q.val) return false;

        return search(p.left, q.left) && search(p.right, q.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return search(p, q);
    }
}
