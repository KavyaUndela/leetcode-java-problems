class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
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
        while(i<nums.length-1 && nums[i]==nums[i+1]){
              i++;
        }
       
        backtracking(nums,i+1,res,subset);
    }
}
    
