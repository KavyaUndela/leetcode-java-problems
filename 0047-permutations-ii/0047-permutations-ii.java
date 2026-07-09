class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> res= new ArrayList<>();
        
        backtracking(nums,0,res);
        return res;



    }
    private void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private void backtracking(int[] nums,int i, List<List<Integer>> res){
        if(i==nums.length){
            ArrayList<Integer>sol= new ArrayList<>();
            for(int k=0;k<nums.length;k++){
            HashSet<Integer>hs= new HashSet<>();
            
            

              sol.add(nums[k]);

            }
            res.add(sol);
            return;
        }
        HashSet<Integer>hs= new HashSet<>();
            
         
        for(int j=i;j<nums.length;j++){
            if(hs.contains(nums[j])){
                continue;
            }
            hs.add(nums[j]);
            swap(nums,i,j);
            backtracking(nums,i+1,res);
            swap(nums,i,j);        
        }
        
            
        
    }
}
    