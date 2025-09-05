class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        addList(root, 0, answer);
        return answer;
    }

    private void addList(TreeNode root, int depth, List<List<Integer>> answer) {
        if(root == null) return;

        if(depth == answer.size()) answer.add(new ArrayList<>());

        answer.get(depth).add(root.val);

        addList(root.left, depth + 1, answer);
        addList(root.right, depth + 1, answer);
    }
}