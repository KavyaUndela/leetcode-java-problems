class Solution {
    public void rotate(int[] nums, int k) {
       int n= nums.length;
       k=k%n;
       if(n==1)
       return;
       int result[]=new int[n];
       for(int i=0;i<k;i++){
           result[i]=nums[n-k+i];
        } 
       for(int i=0;i<n-k;i++){
         result[k+i]=nums[i];
       }
       for(int i=0;i<n;i++){
        nums[i]=result[i];
       }

    }    
}