/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */ 
 class Solution {
    List<Integer> result;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        result = new ArrayList<>();
        findTargetAndPropagate(root, target, k);
        return result;
    }

    // Returns distance to target. Returns -1 if target not found in subtree.
    private int findTargetAndPropagate(TreeNode node, TreeNode target, int k) {
        if (node == null) return -1;

        if (node == target) {
            addSubtreeNodes(node, k);
            return 1; // Return 1 to indicate parent is distance 1 away
        }

        int leftDist = findTargetAndPropagate(node.left, target, k);
        if (leftDist != -1) {
            if (leftDist == k) {
                result.add(node.val);
            } else {
                // Target is in left subtree, check right subtree
                // Distance needed in right child: k - (distance to node) - 1 (edge to right child)
                addSubtreeNodes(node.right, k - leftDist - 1);
            }
            return leftDist + 1;
        }

        int rightDist = findTargetAndPropagate(node.right, target, k);
        if (rightDist != -1) {
            if (rightDist == k) {
                result.add(node.val);
            } else {
                // Target is in right subtree, check left subtree
                addSubtreeNodes(node.left, k - rightDist - 1);
            }
            return rightDist + 1;
        }

        return -1;
    }

    // Standard DFS to add nodes at exactly distance 'dist'
    private void addSubtreeNodes(TreeNode node, int dist) {
        if (node == null || dist < 0) return;
        if (dist == 0) {
            result.add(node.val);
            return;
        }
        addSubtreeNodes(node.left, dist - 1);
        addSubtreeNodes(node.right, dist - 1);
    }
}