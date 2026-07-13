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

    List<Integer> answer = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {

        dfs(root, 0);

        return answer;
    }

    private void dfs(TreeNode root, int level) {

        if (root == null)
            return;

        if (level == answer.size()) {
            answer.add(root.val);
        } else {
            answer.set(level,
                Math.max(answer.get(level), root.val));
        }

        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}