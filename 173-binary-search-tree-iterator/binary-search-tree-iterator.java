class BSTIterator {
    private Deque<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new ArrayDeque<>();
        pushAllLeft(root);
    }
    
    private void pushAllLeft(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public int next() {
        TreeNode topNode = stack.pop();
        if (topNode.right != null) {
            pushAllLeft(topNode.right);
        }
        
        return topNode.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}