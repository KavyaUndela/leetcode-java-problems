class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res= new ArrayList<>();
        ArrayList<Integer> subset= new ArrayList<>();
        backtracking(candidates,target,0,0,res,subset);
        return res;
    }
    private void backtracking(int[] candidates,int target, int i, int sum,List<List<Integer>> res, ArrayList<Integer> subset){
        if(sum==target){
            res.add(new ArrayList<>(subset));
            return;
        }
        if(sum>target){
            return;
        }
        HashSet<Integer>seen= new HashSet<>();


        for(int j=i;j<candidates.length;j++){
            if(seen.contains(candidates[j])){
                continue;
            }
           seen.add(candidates[j]);
           subset.add(candidates[j]);
             backtracking(candidates,target,j+1,sum+candidates[j],res,subset);
             subset.remove(subset.size()-1);
        }
    }
}
    