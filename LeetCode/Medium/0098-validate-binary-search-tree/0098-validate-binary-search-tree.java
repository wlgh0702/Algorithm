class Solution {
    public boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        return isBST(root, min, max);
    }

    private boolean isBST(TreeNode root, long min, long max) {
        if(root == null) return true;

        if(root.val <= min || root.val >= max) return false;

        return isBST(root.left, min, root.val) && isBST(root.right, root.val, max);
    }
}