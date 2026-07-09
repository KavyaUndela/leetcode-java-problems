class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        ArrayList<Integer>subset=new ArrayList<>();
        backtracking(nums,0,res,subset);
        return res;
    }
    private void backtracking(int[] nums, int i, List<List<Integer>>res,ArrayList<Integer> subset){
        if(i==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        backtracking(nums,i+1,res,subset);
        subset.remove(subset.size()-1);
        backtracking(nums,i+1,res,subset);
    }
}