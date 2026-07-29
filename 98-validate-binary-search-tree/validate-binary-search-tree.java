class Pair {
    long max;
    long min;

    Pair(long max, long min) {
        this.max = max;
        this.min = min;
    }
}

class Solution {

    boolean flag = true;

    public boolean isValidBST(TreeNode root) {
        maxMin(root);
        return flag;
    }

    Pair maxMin(TreeNode root) {

        if (root == null)
            return new Pair(Long.MIN_VALUE, Long.MAX_VALUE);

        Pair left = maxMin(root.left);
        Pair right = maxMin(root.right);

        if (left.max >= root.val || right.min <= root.val)
            flag = false;

        long mx = Math.max(root.val, Math.max(left.max, right.max));
        long mn = Math.min(root.val, Math.min(left.min, right.min));

        return new Pair(mx, mn);
    }
}