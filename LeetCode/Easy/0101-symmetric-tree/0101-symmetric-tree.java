import java.util.*;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;

        if(left == null || right == null) return false;

        boolean boolOne = isMirror(left.left, right.right);
        boolean boolTwo = isMirror(left.right, right.left);

        return left.val == right.val && boolOne && boolTwo;
    }
}