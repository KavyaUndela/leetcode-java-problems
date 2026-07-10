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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        traversal(root,res,0);
        return res;
    }
    private void traversal(TreeNode root,List<List<Integer>> res,int d){
        if(root==null){
            return;
        }
    if(res.size()==d){
        res.add(new ArrayList<>());
    }
    res.get(d).add(root.val);
    traversal(root.left,res,d+1);
    traversal(root.right,res,d+1);
}
}