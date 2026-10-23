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
    public int getLeft(TreeNode root) {
        if (root == null) return 0;
        return 1 + getLeft(root.left);
    }

    public int getRight(TreeNode root) {
        if (root == null) return 0;
        return 1 + getRight(root.right);
    }
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int left = getLeft(root);
        int right = getRight(root);

        if (left == right) {
            return (int) Math.pow(2, left) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}