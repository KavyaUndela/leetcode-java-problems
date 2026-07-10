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

    public List<Double> averageOfLevels(TreeNode root) {

        List<Long> sums = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        dfs(root,0,sums,counts);

        List<Double> ans = new ArrayList<>();

        for(int i=0;i<sums.size();i++){
            ans.add((double)sums.get(i)/counts.get(i));
        }

        return ans;
    }

    private void dfs(TreeNode node,int level,
                     List<Long> sums,
                     List<Integer> counts){

        if(node==null)
            return;

        if(level==sums.size()){

            sums.add((long)node.val);
            counts.add(1);

        }else{

            sums.set(level,sums.get(level)+node.val);
            counts.set(level,counts.get(level)+1);

        }

        dfs(node.left,level+1,sums,counts);
        dfs(node.right,level+1,sums,counts);
    }
}