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

// Input: root = [5,3,8,1,4,7,9,null,2], p = 3, q = 8

// Output: 5

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode currNode = root;

        while (currNode != null) {
            if (p.val < currNode.val && q.val < currNode.val) {
                currNode = currNode.left;
            } else if (p.val > currNode.val && q.val > currNode.val) {
                currNode = currNode.right;
            } else break;
        }

        return currNode;
    }
}
