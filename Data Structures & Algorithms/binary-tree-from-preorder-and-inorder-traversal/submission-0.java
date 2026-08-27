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
    private int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> maps = new HashMap<>();

        for (int i=0; i<inorder.length; i++) maps.put(inorder[i], i);

        return build(preorder, 0, inorder.length - 1, maps);
    }

    TreeNode build(int[] preorder, int start, int end, Map<Integer, Integer> maps) {
        if (start > end) return null;

        int rootVal = preorder[preIndex++];

        TreeNode root = new TreeNode(rootVal);

        int inIndex = maps.get(rootVal);

        root.left = build(preorder, start, inIndex - 1, maps);
        root.right = build(preorder, inIndex + 1, end, maps);

        return root;
    }


}
