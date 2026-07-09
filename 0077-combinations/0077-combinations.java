class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
       ArrayList<Integer> subset=new ArrayList<>();
        backtracking(1,n,k,res,subset);
        return res;
    }
    private void backtracking(int i, int n, int k,List<List<Integer>> res,
    ArrayList<Integer>subset){
       
        if(subset.size()==k){
            res.add(new ArrayList<>(subset));
            return;
        }
        for(int j=i;j<=n;j++){
         subset.add(j);
         backtracking(j+1,n,k,res,subset);
         subset.remove(subset.size()-1);
        

        }
    }
}