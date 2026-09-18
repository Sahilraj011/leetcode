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
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        int leftd=minDepth(root.left);
        int rightd=minDepth(root.right);
        if(root.left==null&&root.right==null){
            return 1;
        }
        if(root.left==null){
            return 1+rightd;
        }
        if(root.right==null)return 1+leftd;
        return Math.min(leftd,rightd)+1;

    }   
}