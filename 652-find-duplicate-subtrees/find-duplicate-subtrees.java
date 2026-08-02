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
    Map<String,Integer> map;
    List<TreeNode> list;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map = new HashMap<>();
        list = new ArrayList<>();
        serialize(root);

        return list;
    }

    private String serialize(TreeNode root){
        if(root == null)
            return "#";

        String left = serialize(root.left);
        String right = serialize(root.right);

        String cur = root.val + "," + left + "," + right;

        map.put(cur,map.getOrDefault(cur,0) + 1);

        if(map.get(cur) == 2)
            list.add(root);

        return cur;
    }
}